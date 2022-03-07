# Software-Testing-Project

1. An integrated development environment (e.g. Eclipse or intellij IDEA)
2. A version control software (e.g. SVN, SourceTree or EGit plugin for Eclipse)
3. A version control server (e.g. Bitbucket or Github)
4. A continuous integration (CI) tool (e.g. Jenkins)
5. An automated build tool that connects to the CI tool (e.g. Maven or Ant)
6. An automated test framework for AT LEAST unit and integration tests (e.g. XUnit) (optional) A system test tool (e.g. EyeAutomate or Selenium)

---
## **Task 1: CI-environment setup**
Setup the CI environment with components from the above list that can automatically build the project and run its unit and integration tests. Once the system runs, make a screen recording (Open source and freeware tools can be found online) of the environment when it is executing. The recording should start from you changing some code and pushing it until you get a log-file (or other demonstrator) that shows that the build was successful and that the test cases you’ve added passed.
   You must also supply a model of your CI system, its components, and how they interact (e.g. how they are triggered and in what order). OBS: You don’t need to setup a remote build server, such as Jenkins, if you lack the resources to do so (A Local server is acceptable). If you use a local server, make sure to record somehow that each group member uses the environment, e.g. one video per person.
   
   
  ## **Task 2: Test-driven development** 
  In your project, you should use test-driven development, meaning that you write your test cases first. Hence, in your application (in Java or other language) make sure to add the test cases first, record them failing when executing the environment and then add the code to show the tests passing). Implement the code for the tests and run the tests, showing that the code builds successfully and all tests pass through the CI environment. The code needs to be implemented by all team members who should individually commit/push some code. Hence, after the project there should be AT LEAST one push from each team member. A screenshot from the repository you use (e.g. bitBucket, GitHub or Svn) shall be supplied in the submission to verify this!
  
  
   ## **Task 3: Continuous development and testing** 
   Extend the java project with what you consider a suitable amount of code and tests. The new tests should include at least unit and integration styled tests that follow best test practices but preferably (optional) also some type higher-level system tests performed with Selenium or EyeAutomate. **Note! ALL tests, regardless of type, must execute AUTOMATICALLY from the CI environment!** The recordings should clearly show this happening and give the test results.
   
   
   ### Deliverables:
   In addition to above stated screen-recordings, screenshots and models of the environment, each group must supply a report that describes the CI environment, motivate the technical choices of tools (CI components used), report the challenges that you came across during development of the environment and report solutions to said challenges (e.g. if a tool didn’t work or if there were problems integrating some tools together). The report can be maximum 5 pages. Each group must also provide a link to the code repository where the code is stored. Make sure to include some time logs of how much time each member spent in the project and be honest with the time spent. Each member of the group should also write a short paragraph of their own experiences with setting up and using the environment, e.g. was it difficult, will it be useful in the future, etc. Lastly, add a section of how you collaborated in setting up the environment.
   
