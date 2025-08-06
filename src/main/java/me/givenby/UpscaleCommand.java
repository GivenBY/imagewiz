package me.givenby;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(
        name = "upscale",
        mixinStandardHelpOptions = true,
        description = {
                "Upscale image resolution using AI or filters",
                "",
                "Usage example:",
                "  imagewiz upscale -i lowres.jpg -o highres.jpg"
        }
)
public class UpscaleCommand implements Callable<Integer> {

    @Option(names = {"-i", "--input"}, description = "Input image file")
    private String inputFile;

    @Option(names = {"-o", "--output"}, description = "Output upscaled image file")
    private String outputFile;

    @Override
    public Integer call() {
        System.out.println("Upscaling image...");
        System.out.println("Input : " + inputFile);
        System.out.println("Output: " + outputFile);
        return 0;
    }
}
