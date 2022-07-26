# LemonadeApp
Android App for Lemonade implementing basic Android Studio Features.

App overview
Welcome to Project: Lemonade app!

We have recruited you to our team to help us bring our vision of making digital lemonade to life. The goal is to create a simple, interactive mobile app that allows you to juice lemons until you have a glass of lemonade. Consider it a metaphor, or maybe just a fun way to pass the time!

The finished Lemonade app will consist of a single screen. When users first launch the app, they're greeted with a prompt to pick a lemon by tapping a picture of a lemon tree.

![image](https://user-images.githubusercontent.com/104893913/179928370-80ba8fe5-92d0-4534-8f60-d4c09c059a67.png)

Tapping the lemon tree presents the user with a lemon that they can tap to "squeeze" for an unspecified number of times (the exact number of required squeezes is randomly generated) before moving to the next screen.

![image](https://user-images.githubusercontent.com/104893913/179928496-f3596d54-f50e-49fb-a688-b11717e5a815.png)

Once the user has tapped to squeeze the lemon the correct number of times, they will see an image of a glass to "drink" the lemonade.

![image](https://user-images.githubusercontent.com/104893913/179928622-1804ee12-d8b0-4dbd-a15b-b6102a00a65a.png)

After clicking to drink the lemonade, the glass appears empty, and the user can tap the image again to return to the first screen, and select another lemon from the tree.

![image](https://user-images.githubusercontent.com/104893913/179928708-4d1376f5-e7e9-4b96-a218-d40c96793368.png)

The app is built around simplicity, and is organized in a single activity. The different states of the app (whether the user is selecting a lemon, squeezing the lemon, drinking the lemonade, and, finally, the empty glass) are represented by something called a state machine. This sounds like a fancy theoretical term, but all this means is that the app's state (i.e. which text and image is shown to the user) is determined by a variable that contains the app's state (select, squeeze, etc.). The app's state is updated, along with any other needed variables, and then the UI is configured (setting the image and text) separately once all the updates have been made.

All the variables for the app's state have been defined for you. Your job is to build the app's layout and implement the logic so that the UI transitions between each state as expected.

Testing your code
For the Lemonade app (and future projects), you'll be provided with some automated tests that you can use to verify that your code works as expected.

What are automated tests, exactly? In software development, you can think of a "test" as code that verifies that other code is working. This is done by checking outputs (such as the contents of UI elements on the screen) to see if they make sense based on inputs, known as "test cases." The starter project for the Lemonade app includes a few tests that you'll be able to run to make sure you've implemented the logic correctly. We'll discuss the tests in more detail later. For now, it's time to download the starter code and start building the Lemonade app.
