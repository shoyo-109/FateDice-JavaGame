import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    static int roll;
    static int timesToRoll;
    static int conversation = 1;
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    public static void main(String[] args) throws InterruptedException
    {

        System.out.println("《⚜️ INITIATING PROTOCOL: D.I.C.E — Doom Imminent, Cursed Execution ⚜️》");
        Thread.sleep(1200);
        System.out.println("Welcome, challenger... or should I say, sacrifice.");
        Thread.sleep(1500);

        // calling method to print dice outout

        printDiceOutput();

    }

    static void printDiceOutput() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("⭓ The Cube has spoken...");
        Thread.sleep(1500);

        roll = rd.nextInt(1,7);

        guessTheFace(roll);

        System.out.println("↪️ Its face reveals: " + roll);
        Thread.sleep(1000);

        System.out.println(showFace(roll));


        Thread.sleep(1000);
        System.out.println("\n“𝘠𝘰𝘶 𝘩𝘢𝘷𝘦 𝘳𝘰𝘭𝘭𝘦𝘥. 𝘠𝘰𝘶 𝘩𝘢𝘷𝘦 𝘣𝘦𝘦𝘯 𝘫𝘶𝘥𝘨𝘦𝘥.”");
        Thread.sleep(1000);
        System.out.println("The ritual ends, but the stain remains. The Cube... watches.");

    }

    static void guessTheFace(int roll) throws InterruptedException
    {
        int count = 0;
        String opinion = "";

        if(conversation == 1)
        {
            System.out.print(". ");
            Thread.sleep(1000);
            System.out.print(". ");
            Thread.sleep(1000);
            System.out.print(". ");
            Thread.sleep(1000);

            System.out.println("So... the seal has weakened...");
            Thread.sleep(1200);
            System.out.println("You were not meant to awaken here. And yet...");
            Thread.sleep(1500);
            System.out.println("You, a being of flesh and boredom, have crossed into the realm of The Dice Trial.");
            Thread.sleep(1700);

            System.out.print("Hmmm... ");
            Thread.sleep(1000);
            System.out.print(". ");
            Thread.sleep(1000);
            System.out.println(". ");

            System.out.println("This isn't a mere game. It's a test — a sacred contract between mortal will and coded chaos.");
            Thread.sleep(1600);
            System.out.println("The task is simple...");
            Thread.sleep(1100);
            System.out.println("Guess the fate-sealed face of the cursed cube...");
            Thread.sleep(1500);
            System.out.println("If your guess is wrong... I shall whisper hints to guide you — 'higher'... or 'lower'...");
            Thread.sleep(1800);
            System.out.println(". ");
            Thread.sleep(1000);
            System.out.print(". ");
            Thread.sleep(1000);
            System.out.print(". ");

            System.out.println("So now I ask you... not as a friend... but as a wielder of destiny...");
            Thread.sleep(1500);
            System.out.println("So? Are you brave enough to answer 'yes'? \nOr will you crawl away like the rest — a forgotten glitch in fate’s code?");

            opinion = sc.next();


            if ((opinion.equals("No")) || (opinion.equals("no"))) {
                while (!(opinion.equals("Y") || opinion.equals("y") || opinion.equals("Yes") || opinion.equals("yes")) && count < 4) {
                    count++;

                    if (count == 1) {
                        System.out.println("‘No’? You dare speak that cursed syllable before me?");
                        Thread.sleep(1200);
                        System.out.println("I’ve devoured kings for less, you know...");
                        Thread.sleep(1500);
                        System.out.println("Try again, mortal. Say 'yes'... or keep digging your digital grave.");
                    }

                    if (count == 2) {
                        System.out.println("Still resisting? Fascinating...");
                        Thread.sleep(1300);
                        System.out.println("You're either brave... or staggeringly stupid.");
                        Thread.sleep(1500);
                        System.out.println("One last chance to redeem yourself — speak the word.");
                    }

                    if (count == 3) {
                        System.out.println("Ah... so it ends like this.");
                        Thread.sleep(1200);
                        System.out.println("A user who refuses the call of destiny... how tragic. How poetic.");
                        Thread.sleep(1400);
                        System.out.print("But alas — your refusal means *nothing*.");
                        Thread.sleep(1000);
                        System.out.println("The game has chosen you.");
                        Thread.sleep(1400);
                        System.out.println("We begin... whether you bleed 'yes' or not.");
                    }

                    if (count < 3) {
                        opinion = sc.next();
                    }
                }
            }


            conversation++;


        }

        if (conversation > 1) {
            System.out.println("And so the trial begins...");

            Thread.sleep(1300);
            System.out.println("Before you lies the Cursed Cube of Fate — forged in the void between logic and madness.");
            Thread.sleep(1700);
            System.out.println("It bears six faces... but only one reveals salvation.");
            Thread.sleep(1800);

            System.out.println("Speak now, brave fool. What number do you claim? (1 - 6)");
            opinion = sc.next();

            while (roll != Integer.parseInt(opinion)) {
                int guess = Integer.parseInt(opinion);

                if (roll > guess) {
                    System.out.println("Wrong.");
                    Thread.sleep(1000);
                    System.out.println("Too low... The Cube mocks your inadequacy.");
                    Thread.sleep(1500);
                } else {
                    System.out.println("Wrong.");
                    Thread.sleep(1000);
                    System.out.println("Too high... even the gods laugh at your delusion.");
                    Thread.sleep(1500);
                }

                System.out.println("Dare try again... or flee with your dignity shattered?");
                opinion = sc.next();
            }

            Thread.sleep(1500);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("You... actually guessed it?");
            Thread.sleep(1400);
            System.out.println("Tch... So be it. You have passed this phase.");
            Thread.sleep(1600);
            System.out.println("But know this — the Cube never forgets those who challenge its dominion.");
        }





    }

    static String showFace(int roll)
    {

        String dice ;

        switch (roll) {
            case 1:
                dice = """
                  ╔═════════════╗
                  ║             ║
                  ║      ●      ║
                  ║             ║
                  ╚═════════════╝
                ☠ A single cursed eye stares into the void... and sees you.
                """;
                break;

            case 2:
                dice = """
                  ╔═════════════╗
                  ║ ●           ║
                  ║             ║
                  ║           ● ║
                  ╚═════════════╝
                ☠ Two eyes from forgotten realms. They whisper: “Unworthy.”
                """;
                break;

            case 3:
                dice = """
                  ╔═════════════╗
                  ║ ●           ║
                  ║      ●      ║
                  ║           ● ║
                  ╚═════════════╝
                ☠ Three dots aligned in cursed harmony... The Cube smirks.
                """;
                break;

            case 4:
                dice = """
                  ╔═════════════╗
                  ║  ●       ●  ║
                  ║             ║
                  ║  ●       ●  ║
                  ╚═════════════╝
                ☠ Four sigils form the Mark of Containment. You’ve been sealed.
                """;
                break;

            case 5:
                dice = """
                  ╔═════════════╗
                  ║  ●       ●  ║
                  ║      ●      ║
                  ║  ●       ●  ║
                  ╚═════════════╝
                ☠ Five eyes open. The ritual has begun. Run? No. Kneel.
                """;
                break;

            case 6:
                dice = """
                  ╔═════════════╗
                  ║  ●       ●  ║
                  ║  ●       ●  ║
                  ║  ●       ●  ║
                  ╚═════════════╝
                ☠ Six. The sacred number of entropy. The Cube accepts your blood.
                """;
                break;

            default:
                dice = "The fate is sealed ... you are the reason we witnessed this moment .... you are a disgrace";
        }
        return dice;
    }


}
