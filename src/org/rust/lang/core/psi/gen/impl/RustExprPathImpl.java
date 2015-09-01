// This is a generated file. Not intended for manual editing.
package org.rust.lang.core.psi.gen.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.rust.lang.core.psi.gen.RustElementTypes.*;
import org.rust.lang.core.psi.gen.*;

public class RustExprPathImpl extends RustExprImpl implements RustExprPath {

  public RustExprPathImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitExprPath(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RustExprPath> getExprPathList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RustExprPath.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
