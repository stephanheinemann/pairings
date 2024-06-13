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
