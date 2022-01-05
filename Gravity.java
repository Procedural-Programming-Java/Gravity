/**
 * @author Yaaqov Shkifati
 * @since 02/06/2020
 * @version 1.0
 * Description: Gravity was first discovered by a famous physicist and
 * mathematician named Sir Isaac Newton. While studying the motion of plants at 
 * Cambridge University, he saw a falling apple while thinking about the forces 
 * of nature.  Regardless of what really happened, Newton realized that some
 * force must be acting on falling objects like apples because otherwise they
 * would not start moving from rest. Then he started thinking about his third
 * law of motion," for each action there is equal and opposite reaction".
 * Newton questioned if the apple was moving towards the Earth, and wondered
 * why the Earth doesn't move towards the apple? Then he questioned if the moon
 * also falls just like the apples. Newton concluded that the orbit of the Moon
 * was of exactly the same nature: The Moon continuously "fell" in its path
 * around the Earth because of the acceleration due to gravity, thus producing
 * its orbit. He came  to the conclusion by applying a formula from his second
 * law of motion, F=ma. There is a force which is responsible for the motion of
 * the plants, for the attractions between two bodies. This force between any
 * two bodies, is directly proportional of the product of two mass and inversely
 * proportional to the square of the center to center distance. F= GMm/r^2 is
 * known  as the gravitational force. This breakthrough helped precisely predict
 * projectile motion and celestial motion. However, Mercury doesn't follow the
 * precession that is predicted by Newtonian mechanics. About 225 years later,
 * a brilliant physicist named Albert Einstein discovered a new theory of
 * gravity called General Relativity. He argued that gravity is a not a force
 * but only a result of the fabric of space and time (space-time) being curved
 * due to large masses. The use of non-Euclidean geometry helped Einstein
 * conclude a geometric equation of gravity. With this new revolution of our
 * understanding of gravity, it helped us to understand; space, time, motion of
 * the objects as they approached the speed of light, and how Mercury orbits
 * around the sun.
 *
 * We will be using the trailer method to write this program. This method is
 * effective when you use the a method name while. While is a type of loop which
 * does repeatedly executes a target statement as long as a given condition is
 * true. The condition may be any expression, and true is any non zero value.
 * What will do is create while loop with the condition that the plant is name
 * is  not equal to "done". Then we will signal the data to stop by entering
 * done and that is our trailer.
 *
 *  I really enjoyed writing this program. In fact this topic of gravity has
 * really intrigued me ever since i first read about it. I'm really fascinated
 * by this phenomenon and many more in physics and how its application impacted
 * the world. One of the reasons I choose to pursue in engineering is because
 * I want to use science to help innovate new technologies that would solve
 * world problems. I really hope we get more programs to write that relates to
 * physics.
 */
package gravity;

import java.util.Scanner;
import java.io.PrintStream;

public class Gravity {

    public static PrintStream force;

    public static void main(String[] args) throws Exception {
        final double GRAVITATIONAL_CONSTANT = 6.67e-11, MASS_SUN = 1.989e30;
        double gravityPE, plantMass, radius;
        String planet;

        Scanner sc = new Scanner(System.in);
        force = new PrintStream("data.text");

        promptUser();
        


        planet = sc.next();
        while (!planet.equalsIgnoreCase("DONE")) {
         plantMass = sc.nextDouble();
            radius = sc.nextDouble();

            gravityPE = (-GRAVITATIONAL_CONSTANT * MASS_SUN * plantMass) /
                    (radius);

            System.out.printf(" THE GRAVITATIONAL POTENTIAL ENERGY BETWEEN "
                    + "%s AND THE SUN,\n", planet);

            force.printf(" THE GRAVITATIONAL POTENTIAL ENERGY BETWEEN "
                    + "%s AND THE SUN,\n", planet);

            System.out.printf("AT A DISTANCE OF %.3e METERS IS %.3e N M^2/Kg^2."
                    + "%n%n", radius, gravityPE);

            force.printf("AT A DISTANCE OF %.3e METERS IS %.3e N M^2/Kg^2."
                    + "%n%n", radius, gravityPE);

            promptUser();
            planet = sc.next();

        }

    }

    public static void promptUser() {
        System.out.println("Please enter the Plant name, Mass, and Distance.");
        System.out.println("Please enter DONE when you are finished.\n");
        force.println("Please enter the Plant name, Mass, and Distance.");
        force.println("Please enter DONE when you are finished.\n");
    }
}
