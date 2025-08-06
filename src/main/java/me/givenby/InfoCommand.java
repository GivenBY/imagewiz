package me.givenby;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(
        name = "info",
        mixinStandardHelpOptions = true,
        description = {
                "Get metadata and properties of an image",
                "",
                "Usage example:",
                "  imagewiz info -i image.jpg"
        }
)
public class InfoCommand implements Callable<Integer> {

    @Option(names = {"-i", "--input"}, required = true, description = "Input image file")
    private String inputFile;

    @Override
    public Integer call() {
        System.out.println("Fetching image info...");
        System.out.println("Input: " + inputFile);
        return 0;
    }
}
