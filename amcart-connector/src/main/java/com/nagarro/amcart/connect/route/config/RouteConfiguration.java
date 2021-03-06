package com.nagarro.amcart.connect.route.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The Class RouteConfiguration.
 */
@ConfigurationProperties(prefix = "amcart.connector")
public class RouteConfiguration {

    /** The input file directory. */
    private String inputFileDirectory = "file:///amcart/import";
    private String processedFileDirectory = "file:///amcart/processed";

    /**
     * Gets the input file directory.
     *
     * @return the input file directory
     */
    public String getInputFileDirectory() {
        return inputFileDirectory;
    }

    /**
     * Sets the input file directory.
     *
     * @param inputFileDirectory
     *            the new input file directory
     */
    public void setInputFileDirectory(String inputFileDirectory) {
        this.inputFileDirectory = inputFileDirectory;
    }

    /**
     * Sets the processed file directory.
     *
     * @param processedFileDirectory
     *            the new processed file directory
     */
    public void setProcessedFileDirectory(String processedFileDirectory) {
        this.processedFileDirectory = processedFileDirectory;
    }

    /**
     * Gets the processed file directory.
     *
     * @return the processed file directory
     */
    public String getProcessedFileDirectory() {
        return processedFileDirectory;
    }

}
