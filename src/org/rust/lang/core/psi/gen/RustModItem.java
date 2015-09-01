// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.gen;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.rust.lang.core.psi.RustCompositeElement;

public interface RustModItem extends RustCompositeElement {

  @NotNull
  List<RustExternCrateDecl> getExternCrateDeclList();

  @NotNull
  List<RustItem> getItemList();

  @NotNull
  List<RustUseDecl> getUseDeclList();

  @NotNull
  PsiElement getIdentifier();

}
