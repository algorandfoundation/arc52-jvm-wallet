# arc52-jvm-wallet

Example showcasing how to use the bip32ed25519 Kotlin library in JVM, as opposed to in Android.

Note that you need to produce the .jar files from Algorand Foundation's LazySodium fork as well as the .jar file from the Bip32Ed25519 library.

From the terminal run the following:

```bash
git clone git@github.com:algorandfoundation/arc52-jvm-wallet.git
git clone git@github.com:algorandfoundation/bip32-ed25519-kotlin.git
cd bip32-ed25519-kotlin
./initialize.sh
cd ..
cp bip32-ed25519-kotlin/build/*.jar arc52-jvm-wallet/src/libs/
cp bip32-ed25519-kotlin/sharedModule/libs/*.jar arc52-jvm-wallet/src/libs/
```
