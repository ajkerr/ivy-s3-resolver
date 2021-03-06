resolvers ++= Seq (
  "ohnosequences Releases"  at "http://releases.era7.com.s3.amazonaws.com",
  "ohnosequences Snapshots" at "http://snapshots.era7.com.s3.amazonaws.com"
)

addSbtPlugin("ohnosequences" % "sbt-s3-resolver" % "0.6.0")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.7.1")
