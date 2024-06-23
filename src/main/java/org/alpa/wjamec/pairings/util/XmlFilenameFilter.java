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
package org.alpa.wjamec.pairings.util;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Filters filenames with a XML filename extension.
 * 
 * @see FilenameFilter
 * 
 * @author Stephan Heinemann
 */
public class XmlFilenameFilter implements FilenameFilter {

    /** the XML filename extension */
    public static final String XML_FILENAME_EXT = ".xml";

    /**
     * Determines whether or not a filename has a XML filename extension.
     * 
     * @param dir
     *                 the directory in which the file was found
     * @param name
     *                 the filename of the file
     * 
     * @return true if the filename has a XML filename extension, false otherwise
     * 
     * @see FilenameFilter#accept(File, String)
     */
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(XML_FILENAME_EXT);
    }

    /**
     * Gets the extension of a text filename.
     * 
     * @return the extension of a text filename
     */
    public static String getExtension() {
        return XML_FILENAME_EXT;
    }

}
