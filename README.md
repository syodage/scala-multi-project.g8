A [Giter8][g8] Basic temaplate for scala multi project!

In your favourite terminal run `sbt new syodage/scala-multi-project.g8`. Either enter to use the default values or enter new values you would like to use.

e.g: When prompted `name [Multi Project]:` hit enter to use `Multi Project` as your project name or type a different name and hit enter.

### Manally test

create a project using the gitter template locally run 
`sbt new file://scala-multi-project.g8`

### Gitter syntax
- Use `default.properties` file to introduce variable
- Directory renaming `$dir_name__norm$`
- Variable construct `$some_name;format="lower,hyphen"$`
    - `lower,hyphen` is same as `norm`


Template license
----------------
Written in <YEAR> by <AUTHOR NAME> <AUTHOR E-MAIL ADDRESS>
[other author/contributor lines as appropriate]

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
