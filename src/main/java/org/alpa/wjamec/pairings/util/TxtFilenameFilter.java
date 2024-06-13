package org.alpa.wjamec.pairings.util;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Filters filenames with a text filename extension.
 * 
 * @see FilenameFilter
 * 
 * @author Stephan Heinemann
 */
public class TxtFilenameFilter implements FilenameFilter {

    /** the text filename extension */
    public static final String TXT_FILENAME_EXT = ".txt";

    /**
     * Determines whether or not a filename has a text filename extension.
     * 
     * @param dir
     *                 the directory in which the file was found
     * @param name
     *                 the filename of the file
     * 
     * @return true if the filename has a text filename extension, false otherwise
     * 
     * @see FilenameFilter#accept(File, String)
     */
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(TXT_FILENAME_EXT);
    }

    /**
     * Gets the extension of a text filename.
     * 
     * @return the extension of a text filename
     */
    public static String getExtension() {
        return TXT_FILENAME_EXT;
    }

}
