Pod::Spec.new do |spec|
  spec.name = 'KmpAndroidExistingProjectShared'
  spec.version = '1.0.0'
  spec.homepage = 'https://www.cocoapods.org'
  spec.source = { :git => "git@github.com:marazmone/kmp-android-existing-project.git" }
  spec.authors = 'Serhii Hulenko'
  spec.summary = 'KMM shared code pod'
  spec.static_framework = true
  spec.vendored_frameworks = "KmpAndroidExistingProjectShared.xcframework"
  spec.libraries = "c++"
  spec.ios.deployment_target = '14.1'
end
