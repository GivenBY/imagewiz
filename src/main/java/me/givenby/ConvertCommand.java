package me.givenby;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(
        name = "convert",
        mixinStandardHelpOptions = true,
        description = {
                "Convert image formats",
                "",
                "Usage example:",
                "  imagewiz convert -i input.jpg -o output.png"
        }
)
public class ConvertCommand implements Callable<Integer> {

    @Option(
            names = {"-i", "--input"},
            description = "Input image file path",
            required = true
    )
    private String inputFile;

    @Option(
            names = {"-o", "--output"},
            description = "Output image file path",
            required = true
    )
    private String outputFile;

    @Override
    public Integer call() {
        System.out.println("Converting image...");
        System.out.println("Input : " + inputFile);
        System.out.println("Output: " + outputFile);
        return 0;
    }
}
