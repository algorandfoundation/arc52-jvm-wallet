package org.example

import cash.z.ecc.android.bip39.Mnemonics.MnemonicCode
import cash.z.ecc.android.bip39.toSeed
import foundation.algorand.xhdwalletapi.KeyContext
import foundation.algorand.xhdwalletapi.XHDWalletAPIJVM

fun main() {
        val seed =
                MnemonicCode(
                        "salon zoo engage submit smile frost later decide wing sight chaos renew lizard rely canal coral scene hobby scare step bus leaf tobacco slice".toCharArray()
                )
        val c = XHDWalletAPIJVM(seed.toSeed())
        println("Generated Key: ${c.keyGen(KeyContext.Address, 0u, 0u, 0u).toUByteArray()}")
}
