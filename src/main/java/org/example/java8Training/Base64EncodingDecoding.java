package org.example.java8Training;

import java.util.Base64;

public class Base64EncodingDecoding {

    public static void main(String[] args) {
        String encodedString = "SGVsbG8gV29ybGQ=";
        String encided= Base64.getEncoder().encodeToString("encodedString".getBytes());
        System.out.println("Encoded String: " + encided);
        System.out.println("Decoded String: " + new String(Base64.getDecoder().decode(encodedString)));

        //what is base64 encoding and decoding
        //Base64 encoding is a way to encode binary data into an ASCII string format.
        // It is commonly used to encode binary data such as images, audio, or video files to be transmitted over text-based protocols like HTTP or email.
        // Base64 encoding works by converting the binary data into a string of ASCII characters using a specific set of 64 characters.
        // This allows the data to be safely transmitted as text without the risk of corruption or data loss.


    }
}
