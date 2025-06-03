.class public final Lx0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final a:Lx0/y;


# direct methods
.method public constructor <init>(Lx0/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/u;->a:Lx0/y;

    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 9

    const-class v0, Lx0/q;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lx0/q;

    iget-object p2, p0, Lx0/u;->a:Lx0/y;

    invoke-direct {p1, p3, p4, p2}, Lx0/q;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lx0/y;)V

    return-object p1

    :cond_0
    const-string v0, "fragment"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    return-object v0

    :cond_1
    const-string p2, "class"

    invoke-interface {p4, v0, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    sget-object v1, Leb/y;->d:[I

    invoke-virtual {p3, p4, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    const/4 v2, 0x0

    if-nez p2, :cond_2

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_2
    const/4 v3, 0x1

    const/4 v4, -0x1

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    const/4 v6, 0x2

    invoke-virtual {v1, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_12

    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    .line 1
    :try_start_0
    invoke-static {v1, p2}, Lx0/s;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v8, Lx0/i;

    invoke-virtual {v8, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move v1, v2

    :goto_0
    if-nez v1, :cond_3

    goto/16 :goto_5

    :cond_3
    if-eqz p1, :cond_4

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    :cond_4
    if-ne v2, v4, :cond_6

    if-ne v5, v4, :cond_6

    if-eqz v7, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    if-eq v5, v4, :cond_7

    iget-object v1, p0, Lx0/u;->a:Lx0/y;

    invoke-virtual {v1, v5}, Lx0/y;->D(I)Lx0/i;

    move-result-object v1

    goto :goto_2

    :cond_7
    move-object v1, v0

    :goto_2
    if-nez v1, :cond_8

    if-eqz v7, :cond_8

    iget-object v1, p0, Lx0/u;->a:Lx0/y;

    invoke-virtual {v1, v7}, Lx0/y;->E(Ljava/lang/String;)Lx0/i;

    move-result-object v1

    :cond_8
    if-nez v1, :cond_9

    if-eq v2, v4, :cond_9

    iget-object v1, p0, Lx0/u;->a:Lx0/y;

    invoke-virtual {v1, v2}, Lx0/y;->D(I)Lx0/i;

    move-result-object v1

    :cond_9
    const-string v4, "Fragment "

    if-nez v1, :cond_b

    iget-object v1, p0, Lx0/u;->a:Lx0/y;

    invoke-virtual {v1}, Lx0/y;->I()Lx0/s;

    move-result-object v1

    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    check-cast v1, Lx0/y$d;

    .line 3
    iget-object p3, v1, Lx0/y$d;->b:Lx0/y;

    .line 4
    iget-object p3, p3, Lx0/y;->w:Lx0/t;

    .line 5
    iget-object p3, p3, Lx0/t;->b:Landroid/content/Context;

    .line 6
    invoke-static {p3, p2, v0}, Lx0/i;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lx0/i;

    move-result-object v1

    .line 7
    iput-boolean v3, v1, Lx0/i;->mFromLayout:Z

    if-eqz v5, :cond_a

    move p3, v5

    goto :goto_3

    :cond_a
    move p3, v2

    :goto_3
    iput p3, v1, Lx0/i;->mFragmentId:I

    iput v2, v1, Lx0/i;->mContainerId:I

    iput-object v7, v1, Lx0/i;->mTag:Ljava/lang/String;

    iput-boolean v3, v1, Lx0/i;->mInLayout:Z

    iget-object p3, p0, Lx0/u;->a:Lx0/y;

    iput-object p3, v1, Lx0/i;->mFragmentManager:Lx0/y;

    .line 8
    iget-object p3, p3, Lx0/y;->w:Lx0/t;

    .line 9
    iput-object p3, v1, Lx0/i;->mHost:Lx0/t;

    .line 10
    iget-object p3, p3, Lx0/t;->b:Landroid/content/Context;

    .line 11
    iget-object v0, v1, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v1, p3, p4, v0}, Lx0/i;->onInflate(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    iget-object p3, p0, Lx0/u;->a:Lx0/y;

    invoke-virtual {p3, v1}, Lx0/y;->a(Lx0/i;)Lx0/e0;

    move-result-object p3

    invoke-static {v6}, Lx0/y;->L(I)Z

    move-result p4

    if-eqz p4, :cond_c

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has been inflated via the <fragment> tag: id=0x"

    goto :goto_4

    :cond_b
    iget-boolean p3, v1, Lx0/i;->mInLayout:Z

    if-nez p3, :cond_11

    iput-boolean v3, v1, Lx0/i;->mInLayout:Z

    iget-object p3, p0, Lx0/u;->a:Lx0/y;

    iput-object p3, v1, Lx0/i;->mFragmentManager:Lx0/y;

    .line 12
    iget-object p3, p3, Lx0/y;->w:Lx0/t;

    .line 13
    iput-object p3, v1, Lx0/i;->mHost:Lx0/t;

    .line 14
    iget-object p3, p3, Lx0/t;->b:Landroid/content/Context;

    .line 15
    iget-object v0, v1, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v1, p3, p4, v0}, Lx0/i;->onInflate(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    iget-object p3, p0, Lx0/u;->a:Lx0/y;

    invoke-virtual {p3, v1}, Lx0/y;->h(Lx0/i;)Lx0/e0;

    move-result-object p3

    invoke-static {v6}, Lx0/y;->L(I)Z

    move-result p4

    if-eqz p4, :cond_c

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Retained Fragment "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has been re-attached via the <fragment> tag: id=0x"

    :goto_4
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    const-string v0, "FragmentManager"

    invoke-static {v0, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_c
    check-cast p1, Landroid/view/ViewGroup;

    sget-object p4, Ly0/b;->a:Ly0/b$c;

    .line 16
    new-instance p4, Ly0/c;

    invoke-direct {p4, v1, p1}, Ly0/c;-><init>(Lx0/i;Landroid/view/ViewGroup;)V

    invoke-static {p4}, Ly0/b;->c(Ly0/k;)V

    invoke-static {v1}, Ly0/b;->a(Lx0/i;)Ly0/b$c;

    move-result-object v0

    .line 17
    iget-object v2, v0, Ly0/b$c;->a:Ljava/util/Set;

    .line 18
    sget-object v3, Ly0/b$a;->d:Ly0/b$a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ly0/c;

    invoke-static {v0, v2, v3}, Ly0/b;->f(Ly0/b$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-static {v0, p4}, Ly0/b;->b(Ly0/b$c;Ly0/k;)V

    .line 19
    :cond_d
    iput-object p1, v1, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {p3}, Lx0/e0;->k()V

    invoke-virtual {p3}, Lx0/e0;->j()V

    iget-object p1, v1, Lx0/i;->mView:Landroid/view/View;

    if-eqz p1, :cond_10

    if-eqz v5, :cond_e

    invoke-virtual {p1, v5}, Landroid/view/View;->setId(I)V

    :cond_e
    iget-object p1, v1, Lx0/i;->mView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_f

    iget-object p1, v1, Lx0/i;->mView:Landroid/view/View;

    invoke-virtual {p1, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_f
    iget-object p1, v1, Lx0/i;->mView:Landroid/view/View;

    new-instance p2, Lx0/u$a;

    invoke-direct {p2, p0, p3}, Lx0/u$a;-><init>(Lx0/u;Lx0/e0;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, v1, Lx0/i;->mView:Landroid/view/View;

    return-object p1

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p3, " did not create a view."

    .line 20
    invoke-static {v4, p2, p3}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 21
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Duplicate id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", tag "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", or parent id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " with another fragment for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    :goto_5
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Lx0/u;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
