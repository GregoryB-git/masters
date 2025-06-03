.class public Lj/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public A:Ljava/lang/CharSequence;

.field public B:Ljava/lang/CharSequence;

.field public C:Landroid/content/res/ColorStateList;

.field public D:Landroid/graphics/PorterDuff$Mode;

.field public final synthetic E:Lj/c;

.field public a:Landroid/view/Menu;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Ljava/lang/CharSequence;

.field public l:Ljava/lang/CharSequence;

.field public m:I

.field public n:C

.field public o:I

.field public p:C

.field public q:I

.field public r:I

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:I

.field public w:I

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lj/c;Landroid/view/Menu;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj/c$b;->E:Lj/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lj/c$b;->C:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iput-object p1, p0, Lj/c$b;->D:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    iput-object p2, p0, Lj/c$b;->a:Landroid/view/Menu;

    .line 12
    .line 13
    invoke-virtual {p0}, Lj/c$b;->h()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lj/c$b;->h:Z

    .line 3
    .line 4
    iget-object v0, p0, Lj/c$b;->a:Landroid/view/Menu;

    .line 5
    .line 6
    iget v1, p0, Lj/c$b;->b:I

    .line 7
    .line 8
    iget v2, p0, Lj/c$b;->i:I

    .line 9
    .line 10
    iget v3, p0, Lj/c$b;->j:I

    .line 11
    .line 12
    iget-object v4, p0, Lj/c$b;->k:Ljava/lang/CharSequence;

    .line 13
    .line 14
    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Lj/c$b;->i(Landroid/view/MenuItem;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public b()Landroid/view/SubMenu;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lj/c$b;->h:Z

    .line 3
    .line 4
    iget-object v0, p0, Lj/c$b;->a:Landroid/view/Menu;

    .line 5
    .line 6
    iget v1, p0, Lj/c$b;->b:I

    .line 7
    .line 8
    iget v2, p0, Lj/c$b;->i:I

    .line 9
    .line 10
    iget v3, p0, Lj/c$b;->j:I

    .line 11
    .line 12
    iget-object v4, p0, Lj/c$b;->k:Ljava/lang/CharSequence;

    .line 13
    .line 14
    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p0, v1}, Lj/c$b;->i(Landroid/view/MenuItem;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final c(Ljava/lang/String;)C
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj/c$b;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lj/c$b;->E:Lj/c;

    .line 2
    .line 3
    iget-object v0, v0, Lj/c;->c:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p1, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-object p1

    .line 27
    :catch_0
    move-exception p2

    .line 28
    new-instance p3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v0, "Cannot instantiate class: "

    .line 34
    .line 35
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string p3, "SupportMenuInflater"

    .line 46
    .line 47
    invoke-static {p3, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    return-object p1
.end method

.method public f(Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj/c$b;->E:Lj/c;

    .line 2
    .line 3
    iget-object v0, v0, Lj/c;->c:Landroid/content/Context;

    .line 4
    .line 5
    sget-object v1, Le/i;->M0:[I

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget v0, Le/i;->O0:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lj/c$b;->b:I

    .line 19
    .line 20
    sget v0, Le/i;->Q0:I

    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput v0, p0, Lj/c$b;->c:I

    .line 27
    .line 28
    sget v0, Le/i;->R0:I

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, Lj/c$b;->d:I

    .line 35
    .line 36
    sget v0, Le/i;->S0:I

    .line 37
    .line 38
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput v0, p0, Lj/c$b;->e:I

    .line 43
    .line 44
    sget v0, Le/i;->P0:I

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iput-boolean v0, p0, Lj/c$b;->f:Z

    .line 52
    .line 53
    sget v0, Le/i;->N0:I

    .line 54
    .line 55
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iput-boolean v0, p0, Lj/c$b;->g:Z

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public g(Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lj/c$b;->E:Lj/c;

    iget-object v0, v0, Lj/c;->c:Landroid/content/Context;

    sget-object v1, Le/i;->T0:[I

    invoke-static {v0, p1, v1}, Ll/X;->r(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ll/X;

    move-result-object p1

    sget v0, Le/i;->W0:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ll/X;->l(II)I

    move-result v0

    iput v0, p0, Lj/c$b;->i:I

    sget v0, Le/i;->Z0:I

    iget v2, p0, Lj/c$b;->c:I

    invoke-virtual {p1, v0, v2}, Ll/X;->i(II)I

    move-result v0

    sget v2, Le/i;->a1:I

    iget v3, p0, Lj/c$b;->d:I

    invoke-virtual {p1, v2, v3}, Ll/X;->i(II)I

    move-result v2

    const/high16 v3, -0x10000

    and-int/2addr v0, v3

    const v3, 0xffff

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    iput v0, p0, Lj/c$b;->j:I

    sget v0, Le/i;->b1:I

    invoke-virtual {p1, v0}, Ll/X;->n(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lj/c$b;->k:Ljava/lang/CharSequence;

    sget v0, Le/i;->c1:I

    invoke-virtual {p1, v0}, Ll/X;->n(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lj/c$b;->l:Ljava/lang/CharSequence;

    sget v0, Le/i;->U0:I

    invoke-virtual {p1, v0, v1}, Ll/X;->l(II)I

    move-result v0

    iput v0, p0, Lj/c$b;->m:I

    sget v0, Le/i;->d1:I

    invoke-virtual {p1, v0}, Ll/X;->m(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj/c$b;->c(Ljava/lang/String;)C

    move-result v0

    iput-char v0, p0, Lj/c$b;->n:C

    sget v0, Le/i;->k1:I

    const/16 v2, 0x1000

    invoke-virtual {p1, v0, v2}, Ll/X;->i(II)I

    move-result v0

    iput v0, p0, Lj/c$b;->o:I

    sget v0, Le/i;->e1:I

    invoke-virtual {p1, v0}, Ll/X;->m(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj/c$b;->c(Ljava/lang/String;)C

    move-result v0

    iput-char v0, p0, Lj/c$b;->p:C

    sget v0, Le/i;->o1:I

    invoke-virtual {p1, v0, v2}, Ll/X;->i(II)I

    move-result v0

    iput v0, p0, Lj/c$b;->q:I

    sget v0, Le/i;->f1:I

    invoke-virtual {p1, v0}, Ll/X;->p(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Le/i;->f1:I

    invoke-virtual {p1, v0, v1}, Ll/X;->a(IZ)Z

    move-result v0

    :goto_0
    iput v0, p0, Lj/c$b;->r:I

    goto :goto_1

    :cond_0
    iget v0, p0, Lj/c$b;->e:I

    goto :goto_0

    :goto_1
    sget v0, Le/i;->X0:I

    invoke-virtual {p1, v0, v1}, Ll/X;->a(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lj/c$b;->s:Z

    sget v0, Le/i;->Y0:I

    iget-boolean v2, p0, Lj/c$b;->f:Z

    invoke-virtual {p1, v0, v2}, Ll/X;->a(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lj/c$b;->t:Z

    sget v0, Le/i;->V0:I

    iget-boolean v2, p0, Lj/c$b;->g:Z

    invoke-virtual {p1, v0, v2}, Ll/X;->a(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lj/c$b;->u:Z

    sget v0, Le/i;->p1:I

    const/4 v2, -0x1

    invoke-virtual {p1, v0, v2}, Ll/X;->i(II)I

    move-result v0

    iput v0, p0, Lj/c$b;->v:I

    sget v0, Le/i;->g1:I

    invoke-virtual {p1, v0}, Ll/X;->m(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj/c$b;->z:Ljava/lang/String;

    sget v0, Le/i;->h1:I

    invoke-virtual {p1, v0, v1}, Ll/X;->l(II)I

    move-result v0

    iput v0, p0, Lj/c$b;->w:I

    sget v0, Le/i;->j1:I

    invoke-virtual {p1, v0}, Ll/X;->m(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj/c$b;->x:Ljava/lang/String;

    sget v0, Le/i;->i1:I

    invoke-virtual {p1, v0}, Ll/X;->m(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj/c$b;->y:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    goto :goto_2

    :cond_1
    move v3, v1

    :goto_2
    if-eqz v3, :cond_2

    iget v4, p0, Lj/c$b;->w:I

    if-nez v4, :cond_2

    iget-object v4, p0, Lj/c$b;->x:Ljava/lang/String;

    if-nez v4, :cond_2

    sget-object v3, Lj/c;->f:[Ljava/lang/Class;

    iget-object v4, p0, Lj/c$b;->E:Lj/c;

    iget-object v4, v4, Lj/c;->b:[Ljava/lang/Object;

    invoke-virtual {p0, v0, v3, v4}, Lj/c$b;->e(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    if-eqz v3, :cond_3

    const-string v0, "SupportMenuInflater"

    const-string v3, "Ignoring attribute \'actionProviderClass\'. Action view already specified."

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_3
    sget v0, Le/i;->l1:I

    invoke-virtual {p1, v0}, Ll/X;->n(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lj/c$b;->A:Ljava/lang/CharSequence;

    sget v0, Le/i;->q1:I

    invoke-virtual {p1, v0}, Ll/X;->n(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lj/c$b;->B:Ljava/lang/CharSequence;

    sget v0, Le/i;->n1:I

    invoke-virtual {p1, v0}, Ll/X;->p(I)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    sget v0, Le/i;->n1:I

    invoke-virtual {p1, v0, v2}, Ll/X;->i(II)I

    move-result v0

    iget-object v2, p0, Lj/c$b;->D:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v2}, Ll/B;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iput-object v0, p0, Lj/c$b;->D:Landroid/graphics/PorterDuff$Mode;

    goto :goto_4

    :cond_4
    iput-object v3, p0, Lj/c$b;->D:Landroid/graphics/PorterDuff$Mode;

    :goto_4
    sget v0, Le/i;->m1:I

    invoke-virtual {p1, v0}, Ll/X;->p(I)Z

    move-result v0

    if-eqz v0, :cond_5

    sget v0, Le/i;->m1:I

    invoke-virtual {p1, v0}, Ll/X;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lj/c$b;->C:Landroid/content/res/ColorStateList;

    goto :goto_5

    :cond_5
    iput-object v3, p0, Lj/c$b;->C:Landroid/content/res/ColorStateList;

    :goto_5
    invoke-virtual {p1}, Ll/X;->t()V

    iput-boolean v1, p0, Lj/c$b;->h:Z

    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lj/c$b;->b:I

    .line 3
    .line 4
    iput v0, p0, Lj/c$b;->c:I

    .line 5
    .line 6
    iput v0, p0, Lj/c$b;->d:I

    .line 7
    .line 8
    iput v0, p0, Lj/c$b;->e:I

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lj/c$b;->f:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lj/c$b;->g:Z

    .line 14
    .line 15
    return-void
.end method

.method public final i(Landroid/view/MenuItem;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lj/c$b;->s:Z

    .line 2
    .line 3
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, Lj/c$b;->t:Z

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-boolean v1, p0, Lj/c$b;->u:Z

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v1, p0, Lj/c$b;->r:I

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-lt v1, v3, :cond_0

    .line 24
    .line 25
    move v1, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v1, v2

    .line 28
    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, Lj/c$b;->l:Ljava/lang/CharSequence;

    .line 33
    .line 34
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget v1, p0, Lj/c$b;->m:I

    .line 39
    .line 40
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 41
    .line 42
    .line 43
    iget v0, p0, Lj/c$b;->v:I

    .line 44
    .line 45
    if-ltz v0, :cond_1

    .line 46
    .line 47
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    iget-object v0, p0, Lj/c$b;->z:Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, Lj/c$b;->E:Lj/c;

    .line 55
    .line 56
    iget-object v0, v0, Lj/c;->c:Landroid/content/Context;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/content/Context;->isRestricted()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    new-instance v0, Lj/c$a;

    .line 65
    .line 66
    iget-object v1, p0, Lj/c$b;->E:Lj/c;

    .line 67
    .line 68
    invoke-virtual {v1}, Lj/c;->b()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v4, p0, Lj/c$b;->z:Ljava/lang/String;

    .line 73
    .line 74
    invoke-direct {v0, v1, v4}, Lj/c$a;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    const-string v0, "The android:onClick attribute cannot be used within a restricted context"

    .line 84
    .line 85
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_3
    :goto_1
    iget v0, p0, Lj/c$b;->r:I

    .line 90
    .line 91
    const/4 v1, 0x2

    .line 92
    if-lt v0, v1, :cond_4

    .line 93
    .line 94
    instance-of v0, p1, Landroidx/appcompat/view/menu/e;

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    move-object v0, p1

    .line 99
    check-cast v0, Landroidx/appcompat/view/menu/e;

    .line 100
    .line 101
    invoke-virtual {v0, v3}, Landroidx/appcompat/view/menu/e;->s(Z)V

    .line 102
    .line 103
    .line 104
    :cond_4
    iget-object v0, p0, Lj/c$b;->x:Ljava/lang/String;

    .line 105
    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    sget-object v1, Lj/c;->e:[Ljava/lang/Class;

    .line 109
    .line 110
    iget-object v2, p0, Lj/c$b;->E:Lj/c;

    .line 111
    .line 112
    iget-object v2, v2, Lj/c;->a:[Ljava/lang/Object;

    .line 113
    .line 114
    invoke-virtual {p0, v0, v1, v2}, Lj/c$b;->e(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Landroid/view/View;

    .line 119
    .line 120
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    .line 121
    .line 122
    .line 123
    move v2, v3

    .line 124
    :cond_5
    iget v0, p0, Lj/c$b;->w:I

    .line 125
    .line 126
    if-lez v0, :cond_7

    .line 127
    .line 128
    if-nez v2, :cond_6

    .line 129
    .line 130
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    const-string v0, "SupportMenuInflater"

    .line 135
    .line 136
    const-string v1, "Ignoring attribute \'itemActionViewLayout\'. Action view already specified."

    .line 137
    .line 138
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    :cond_7
    :goto_2
    iget-object v0, p0, Lj/c$b;->A:Ljava/lang/CharSequence;

    .line 142
    .line 143
    invoke-static {p1, v0}, LI/i;->b(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V

    .line 144
    .line 145
    .line 146
    iget-object v0, p0, Lj/c$b;->B:Ljava/lang/CharSequence;

    .line 147
    .line 148
    invoke-static {p1, v0}, LI/i;->f(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    iget-char v0, p0, Lj/c$b;->n:C

    .line 152
    .line 153
    iget v1, p0, Lj/c$b;->o:I

    .line 154
    .line 155
    invoke-static {p1, v0, v1}, LI/i;->a(Landroid/view/MenuItem;CI)V

    .line 156
    .line 157
    .line 158
    iget-char v0, p0, Lj/c$b;->p:C

    .line 159
    .line 160
    iget v1, p0, Lj/c$b;->q:I

    .line 161
    .line 162
    invoke-static {p1, v0, v1}, LI/i;->e(Landroid/view/MenuItem;CI)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lj/c$b;->D:Landroid/graphics/PorterDuff$Mode;

    .line 166
    .line 167
    if-eqz v0, :cond_8

    .line 168
    .line 169
    invoke-static {p1, v0}, LI/i;->d(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)V

    .line 170
    .line 171
    .line 172
    :cond_8
    iget-object v0, p0, Lj/c$b;->C:Landroid/content/res/ColorStateList;

    .line 173
    .line 174
    if-eqz v0, :cond_9

    .line 175
    .line 176
    invoke-static {p1, v0}, LI/i;->c(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)V

    .line 177
    .line 178
    .line 179
    :cond_9
    return-void
.end method
