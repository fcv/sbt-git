enablePlugins(GitVersioning)

git.versionProperty := "DUMMY_BUILD_VERSION"

val checkVersion = taskKey[Unit]("checks the version is the tag version")
checkVersion := {
  val v = version.value
  assert(!(v startsWith "1.0"), s"git.baseVersion is meant to be optional ${v}")
}