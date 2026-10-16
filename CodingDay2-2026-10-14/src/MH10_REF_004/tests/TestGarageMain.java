package MH10_REF_004.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import MH10_REF_004.starter.GarageMain;

public class TestGarageMain {

    @Test
    public void testRunApp() {
        GarageMain g = new GarageMain();
        String actualOutput = g.runApp();

        // Tests run from the project root; the generator puts the file in src/<ID>/starter/
        Path filename = Path.of("src", "MH10_REF_004", "starter", "refactoringOriginalOutput.txt");
        String expectedOutput = "";
        try {
            expectedOutput = Files.readString(filename);
        } catch (IOException e) {
            fail("Cannot read expected output file " + filename.toAbsolutePath()
                    + " (run the tests from the project root): " + e);
        }

        // The file may have Windows line endings (git autocrlf); the program prints "\n"
        expectedOutput = expectedOutput.replace("\r\n", "\n");
        assertEquals(expectedOutput, actualOutput);
    }
}
