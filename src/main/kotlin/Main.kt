package org.example

import cash.z.ecc.android.bip39.Mnemonics.MnemonicCode
import cash.z.ecc.android.bip39.toSeed
import com.algorandfoundation.bip32ed25519.Bip32Ed25519JVM
import com.algorandfoundation.bip32ed25519.KeyContext

fun main() {
        val seed =
                        MnemonicCode(
                                        "salon zoo engage submit smile frost later decide wing sight chaos renew lizard rely canal coral scene hobby scare step bus leaf tobacco slice".toCharArray()
                        )
        val c = Bip32Ed25519JVM(seed.toSeed())
        c.keyGen(KeyContext.Address, 0u, 0u, 0u)
}
