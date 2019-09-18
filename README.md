# coding-challenge

Here host codes of Futurera's coding challenges.

## To contribute:

* Put your coding challenge class within `/src/io/futurera/algorithm` folder
* Add javadoc to explain the original question
* Put your test runner class in `/src/io/futurera/algorithm/tests` folder
* Submit a Pull Request


## To participate and practice:

1. The order to complete the tasks, recommended by our questions committees based on the difficulty ASC is:

- PlusOne (15 min)
- RemoveAllDuplicatesFromSortedArray (15 min)
- BracketMatch (15 min)
- BSTIteratorTestRunner (15 min)
- MaximumSubarray (30 min)
- LFUCacheTestRunner (30 min)
- TheSkylineProblem (30 min)
  Please note that the difficulty level may vary from person to person because of the experience and how hard they practice.

2. The exact questions are introduced in the files. Please read the question carefully before you start coding, to make sure you are satisfying the requirement.

3. It is strongly recoommended that you should not look at the test cases while you are solving the challenges.

4. To test your codes, cd to coding-challenge/src folder, and then:

- `javac io/futurera/algorithm/tests/{the java file you are going to test}`
- `java -cp . io/futurera/algorithm/tests/{the class file you are going to test, without file extension)`

  The first line compiles the file, while the second line executes the main function in the class. Make sure you have the .(dot) in the right place in the java execution command.
  e.g., to test BracketMatch, you need to execute the two commands here:

  `javac io/futurera/algorithm/tests/BracketMatchTestRunner.java`

  `java -cp . io/futurera/algorithm/BracketMatchTestRunner`
