package me.givenby;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(
        name = "imagewiz",
        mixinStandardHelpOptions = true,
        version = "ImageWiz 1.0",
        description = "A powerful CLI tool to convert, upscale, and get info about images.",
        subcommands = {
                ConvertCommand.class,
                UpscaleCommand.class,
                InfoCommand.class
        }
)
public class ImagewizApplication implements Runnable {

    @Override
    public void run() {
        System.out.println("ImageWiz CLI - Use one of the subcommands:");
        System.out.println("  convert   Convert images between formats");
        System.out.println("  upscale   Enhance image resolution");
        System.out.println("  info      Get image metadata");
        System.out.println("\nTry: imagewiz convert -i input.jpg -o output.png");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ImagewizApplication()).execute(args);
        System.exit(exitCode);
    }
}
