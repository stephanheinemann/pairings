/*
 * Copyright © 2024, Stephan Heinemann
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.alpa.wjamec.pairings.cli;

import java.util.Arrays;

import com.github.rvesse.airline.annotations.Cli;
import com.github.rvesse.airline.annotations.help.Copyright;
import com.github.rvesse.airline.annotations.help.Version;
import com.github.rvesse.airline.help.Help;
import com.github.rvesse.airline.parser.ParseResult;
import com.github.rvesse.airline.parser.errors.ParseException;

/**
 * Realizes a pairings command line interface for transformations and queries.
 * 
 * @author Stephan Heinemann
 */
@Cli(name = "pairalyze", description = "WestJet ALPA MEC Pairings Analyzer", defaultCommand = Help.class, commands = {
        TransformCommand.class, FilterCommand.class, SortCommand.class, Help.class })
@Copyright(startYear = 2024, holder = "Stephan Heinemann")
@Version(sources = "META-INF/maven/org.alpa.wjamec/pairings/pom.properties", suppressOnError = true)
public class CommandLine {

    /**
     * Starts the pairings command line interface.
     * 
     * @param args
     *                 the command line arguments
     */
    public static void main(String[] args) {
        com.github.rvesse.airline.Cli<Runnable> cli = new com.github.rvesse.airline.Cli<>(CommandLine.class);

        try {
            ParseResult<Runnable> result = cli.parseWithResult(args);
            if (result.wasSuccessful()) {
                // parsing succeeded: run command
                result.getCommand().run();
                System.exit(0);
            } else {
                // parsing failed: display errors
                for (ParseException e : result.getErrors()) {
                    System.err.println(String.format("Error: %s", e.getMessage()));
                }

                System.err.println();

                Help.<Runnable> help(cli.getMetadata(), Arrays.asList(args), System.err);
            }
        } catch (Exception e) {
            System.err.println(String.format("Error: %s", e.getMessage()));
        }

        System.exit(1);
    }

}
