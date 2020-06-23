// give the user a nice default project!
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "$scala_version$"
ThisBuild / version := "0.0.1-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "$name$"
  ).aggregate(
    $sub_project_1_name;format="space,camel"$,
    $sub_project_2_name;format="space,camel"$
  )

lazy val $sub_project_1_name;format="space,camel"$ = (project in file("$sub_project_1_name;format="norm"$"))
  .settings(
    name := "$sub_project_1_name;format="space"$"
  )

lazy val $sub_project_2_name;format="space,camel"$ = (project in file("$sub_project_2_name;format="norm"$")).
  settings(
    name := "$sub_project_2_name;format="space"$"
  )
