package sprint;


import java.util.Scanner;


public class CypherTool {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       //System.out.println("Welcome to the Cypher Tool!");
       System.out.println("█████   ███   █████         ████");
       System.out.println("░░███   ░███  ░░███        ░░███");
       System.out.println(" ░███   ░███   ░███  ██████ ░███   ██████   ██████  █████████████    ██████ ");
       System.out.println(" ░███   ░███   ░███ ███░░███░███  ███░░███ ███░░███░░███░░███░░███  ███░░███");
       System.out.println(" ░███   ░███   ░███░███████ ░███ ░███ ░░░ ░███ ░███ ░███ ░███ ░███ ░██████ ");
       System.out.println("  ░░░█████░█████░  ░███░░░  ░███ ░███  ███░███ ░███ ░███ ░███ ░███ ░███░░░  ");
       System.out.println("    ░░███ ░░███    ░░██████ █████░░██████ ░░██████  █████░███ █████░░██████ ");
       System.out.println("     ░░░   ░░░     ░░░░░░ ░░░░░  ░░░░░░   ░░░░░░  ░░░░░ ░░░ ░░░░░  ░░░░░░  ");
       System.out.println("  █████                 █████   █████ ");
       System.out.println(" ░░███                 ░░███   ░░███ ");
       System.out.println(" ███████    ██████     ███████  ░███████    ██████ ");
       System.out.println("░░░███░    ███░░███   ░░░███░   ░███░░███  ███░░███ ");
       System.out.println("  ░███    ░███ ░███     ░███    ░███ ░███ ░███████ ");
       System.out.println("  ░███ ███░███ ░███     ░███ ███░███ ░███ ░███░░░ ");
       System.out.println("  ░░█████ ░░██████      ░░█████ ████ █████░░██████ ");
       System.out.println("   ░░░░░   ░░░░░░        ░░░░░ ░░░░ ░░░░░  ░░░░░░ ");
       System.out.println("   █████████                    █████ ");
       System.out.println("  ███░░░░░███                  ░░███ ");
       System.out.println(" ███     ░░░ █████ ████████████ ░███████    ██████  ████████ ");
       System.out.println("░███        ░░███ ░███░░███░░███░███░░███  ███░░███░░███░░███ ");
       System.out.println("░███         ░███ ░███ ░███ ░███░███ ░███ ░███████  ░███ ░░░ ");
       System.out.println("░░███     ███░███ ░███ ░███ ░███░███ ░███ ░███░░░   ░███ ");
       System.out.println(" ░░█████████ ░░███████ ░███████ ████ █████░░██████  █████ ");
       System.out.println("  ░░░░░░░░░   ░░░░░███ ░███░░░ ░░░░ ░░░░░  ░░░░░░  ░░░░░ ");
       System.out.println("              ███ ░███ ░███ ");
       System.out.println(" ███████████ ░░██████  ████████   ███ ");
       System.out.println("░█░░░███░░░█  ░░░░░░  ░░░░░░███  ░███ ");
       System.out.println("░   ░███  ░██████   ██████ ░███  ░███ ");
       System.out.println("    ░███  ███░░███ ███░░███░███  ░███ ");
       System.out.println("    ░███ ░███ ░███░███ ░███░███  ░███ ");
       System.out.println("    ░███ ░███ ░███░███ ░███░███  ░░░ ");
       System.out.println("    █████░░██████ ░░██████ █████  ███ ");
       System.out.println("   ░░░░░  ░░░░░░   ░░░░░░ ░░░░░  ░░░ ");

       System.out.println("\nSelect operation:\n1. Encrypt\n2. Decrypt");
       outerLoop: while (true) {
           String input = getInput(scan);
           if (input.equalsIgnoreCase("exit")) {
               System.out.println("\nSee you next time!");
               System.exit(1);
           }


           switch (input) {
               case "1":
                   while (true) {
                       System.out.println("\nSelect cypher:\n1. ROT13\n2. Atbash\n3. Vigenere");
                       input = getInput(scan);
                       if (input.equalsIgnoreCase("exit")) {
                           System.out.println("\nSee you next time!");
                           System.exit(1);
                       }
                       switch (input) {
                           case "1":
                               System.out.println("\nEnter the message:");
                               input = getInput(scan);
                               System.out.println("\nHere is your encrypted message: " + Rot13(input)
                                       + "\n\nThank you for using the Cypher Tool!");
                               break outerLoop;


                           case "2":
                               System.out.println("\nEnter the message:");
                               input = getInput(scan);
                               System.out.println("\nHere is your encrypted message: " + Atbash(input)
                                       + "\n\nThank you for using the Cypher Tool!");
                               break outerLoop;


                           case "3":
                               boolean validKey = false;
                               System.out.println("\nPlease type the message you would like to encrypt:");
                               String encrypt = getInput(scan);


                               while (!validKey) {
                                   System.out.println(
                                           "\nTime to create your encryption key!\n(To decrypt your message you will need the key)");
                                   String key = getInput(scan);
                                   if (!key.chars().allMatch(Character::isAlphabetic)) {
                                       System.out.println(
                                               "\nInvalid input\nKey should only contain alphabetic characters.");
                                   } else {
                                       validKey = true;


                                       System.out.println("\nHere is your encrypted message: "
                                               + encryptVigenere(encrypt, key)
                                               + "\n\nThank you for using the Cypher Tool!\nDon't forget your key as you'll need it to decrypt your message!");
                                       break outerLoop;
                                   }
                               }


                           default:
                               System.out.println(
                                       "\nInvalid input\nIf you wish to leave the program, enter 'exit'\nOtherwise, please select one of the below options");
                               continue;
                       }
                   }
               case "2":
                   System.out.println("\nSelect cypher:\n1. ROT13\n2. Atbash\n3. Vigenere");
                   input = getInput(scan);
                   if (input.equalsIgnoreCase("exit")) {
                        System.out.println("\nSee you next time!"); 
                       System.exit(1);
                   }
                   switch (input) {
                       case "1":
                           System.out.println("\nEnter the message:");
                           input = getInput(scan);
                           System.out.println("\nHere is your encrypted message: " + Rot13(input)
                                   + "\n\nThank you for using the Cypher Tool!");
                           break outerLoop;


                       case "2":
                           System.out.println("\nEnter the message:");
                           input = getInput(scan);
                           System.out.println("\nHere is your decrypted message: " + Atbash(input)
                                   + "\n\nThank you for using the Cypher Tool!");
                           break outerLoop;


                       case "3":
                           boolean validKey = false;
                           System.out.println("\nPlease type the message you would like to decrypt:");
                           String decrypt = getInput(scan);


                           while (!validKey) {
                               System.out.println("\nEnter the key:");
                               String key = getInput(scan);
                               if (!key.chars().allMatch(Character::isAlphabetic)) {
                                   System.out.println(
                                           "\nInvalid input\nKey should only contain alphabetic characters.");
                               } else {
                                   validKey = true;
                                   System.out.println(
                                           "\nHere is your decrypted message: " + decryptVigenere(decrypt, key)
                                                   + "\n\nThank you for using the Cypher Tool!");
                                   break outerLoop;
                               }
                           }


                       default:
                           System.out.println(
                                   "\nInvalid input\nIf you wish to leave the program, enter 'exit'\nOtherwise, please select one of the below options");
                           continue;
                   }
               default:
                   System.out.println(
                           "\nInvalid input!\nTo leave the program, enter 'exit'\nTo continue, enter '1'(Encrypt) or '2'(Decrypt):");
                   continue;
           }
       }
      
      main(args);
   }


   public static String getInput(Scanner scan) {
       String input = scan.nextLine().trim();
       return input;
   }


   public static String Rot13(String messageinput) {
       StringBuilder sb = new StringBuilder(); // need it to build a word from symbols
       for (int i = 0; i < messageinput.length(); i++) { // for cycle taking the symbol on "i" position
           char c = messageinput.charAt(i);


           if (c >= 'a' && c <= 'm')
               c += 13; // ROT 13 code so it worked with both upper and lower letters.
           else if (c >= 'A' && c <= 'M')
               c += 13;
           else if (c >= 'n' && c <= 'z')
               c -= 13;
           else if (c >= 'N' && c <= 'Z')
               c -= 13;
           sb.append(c); // taking character c and adding it to the end of the StringBuilder
       }
       return sb.toString();
   }


   public static String Atbash(String input) {
       StringBuilder result = new StringBuilder();
       for (char c : input.toCharArray()) {
           if (c >= 'a' && c <= 'z') {
               // a -> z, b -> y, ..., z -> a
               result.append((char) ('z' - (c - 'a')));
           } else if (c >= 'A' && c <= 'Z') {
               // A -> Z, B -> Y, ..., Z -> A
               result.append((char) ('Z' - (c - 'A')));
           } else {
               // Leave non-letter characters unchanged
               result.append(c);
           }
       }


       return result.toString();
   }


   public static String encryptVigenere(String str, String key) {
       String encryptedText = ""; // Where to build the encrypted message
       for (int i = 0; i < str.length(); i++) {
           char letterStr = str.charAt(i); // character you want to encrypt
           char letterKey = key.charAt(i % key.length()); // generates the key & mod makes it wrap back around when end
                                                          // of
                                                          // keyword is reached


           // For uppercase characters
           if (Character.isUpperCase(letterStr)) {
               int x = (letterStr + Character.toUpperCase(letterKey) - 2 * 'A') % 26;
               // add ASCII value of letterStr & uppercase letterKey
               // minus double the value of 'A' (130)
               // % 26 to keep the value stays within 0-25('A' - 'Z')


               x += 'A'; // x is a number between 0 to 25 which is converted back to a letter by adding
                         // the ASCII value of 'A'
               encryptedText += (char) (x);
           }
           // For lowercase characters
           else if (Character.isLowerCase(letterStr)) {
               int x = (letterStr + Character.toLowerCase(letterKey) - 2 * 'a') % 26;
               x += 'a';
               encryptedText += (char) (x);
           }


           // For non-alphabet characters
           else {
               encryptedText += letterStr;
           }
       }
       return encryptedText;
   }


   public static String decryptVigenere(String str, String key) {
       String originalText = "";
       for (int i = 0; i < str.length(); i++) {
           char letterStr = str.charAt(i);
           char letterKey = key.charAt(i % key.length());
           if (Character.isUpperCase(letterStr)) {
               int x = (letterStr - Character.toUpperCase(letterKey) + 26) % 26;
               // subtracts ASCII value of letterStr & uppercase letterKey
               // +26 keeps result non-negative for the modulo (only works with positive ints)
               // % 26 to keep the value stays within 0-25('A' - 'Z')


               x += 'A';
               originalText += (char) (x);
           } else if (Character.isLowerCase(letterStr)) {
               int x = (letterStr - Character.toLowerCase(letterKey) + 26) % 26;
               x += 'a';
               originalText += (char) (x);
           } else {
               originalText += letterStr;
           }
       }
       return originalText;
   }
}
