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
package org.alpa.wjamec.pairings.exceptions;

/**
 * Realizes an exception encapsulating occurrences while processing pairings.
 * 
 * @author Stephan Heinemann
 */
public class PairingsException extends Exception {

    /** the serial version identifier */
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a pairings exception from a message.
     * 
     * @param message
     *                    the message of the pairings exception
     */
    public PairingsException(String message) {
        super(message);
    }

    /**
     * Constructs a pairings exception from a cause.
     * 
     * @param cause
     *                  the cause of the pairings exception
     */
    public PairingsException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a pairings exception from a message and a cause.
     * 
     * @param message
     *                    the message of the pairings exception
     * @param cause
     *                    the cause of the pairings exception
     */
    public PairingsException(String message, Throwable cause) {
        super(message, cause);
    }

}
