# mill-dep-proj

`mill-dep-proj` is a Mill project with moderately complicated project depedencies (foreign modules and sub-projects etc) usefull for testing mill and it's integration with IDEs.


The main build file is located inside the `main` folder as one of the tests we are doing is to check that the projects in another part of the filesystem can be incorporated (foreign modules).

# Run the tests

    cd main
    mill dep-proj.run

 
