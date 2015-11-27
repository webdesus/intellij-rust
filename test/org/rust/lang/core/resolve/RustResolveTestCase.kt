package org.rust.lang.core.resolve

import org.rust.lang.RustTestCase
import org.rust.lang.core.psi.RustNamedElement
import org.rust.lang.core.resolve.ref.RustReference

class RustResolveTestCase : RustResolveTestCaseBase() {
    override fun getTestDataPath() = "testData/org/rust/lang/core/resolve/fixtures"

    fun testFunctionArgument() = checkIsBound()
    fun testLocals() = checkIsBound(atOffset = 19)
    fun testShadowing() = checkIsBound(atOffset = 35)
    fun testNestedPatterns() = checkIsBound()
    fun testClosure() = checkIsBound()
    fun testMatch() = checkIsBound()
    fun testIfLet() = checkIsBound()
    fun testIfLetX() = checkIsUnbound()
    fun testWhileLet() = checkIsBound()
    fun testWhileLetX() = checkIsUnbound()
    fun testFor() = checkIsBound()
    fun testTraitMethodArgument() = checkIsBound()
    fun testImplMethodArgument() = checkIsBound()
    fun testStructPatterns1() = checkIsBound(atOffset = 69)
    fun testStructPatterns2() = checkIsBound()
    fun testModItems() = checkIsBound()
    fun testCrateItems() = checkIsBound()
    fun testNestedModule() = checkIsBound(atOffset = 55)
    fun testLetCycle2() = checkIsBound(atOffset = 20)
    fun testLetCycle1() = checkIsUnbound()
    fun testUnbound() = checkIsUnbound()
    fun testOrdering() = checkIsUnbound()
    fun testModBoundary() = checkIsUnbound()
    fun testFollowPath() = checkIsUnbound()

}
