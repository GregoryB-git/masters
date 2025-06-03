.class public Lu1/g$d;
.super Lu1/g$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:Ljava/util/ArrayList;

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public final j:Landroid/graphics/Matrix;

.field public k:I

.field public l:[I

.field public m:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu1/g$e;-><init>(Lu1/g$a;)V

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lu1/g$d;->a:Landroid/graphics/Matrix;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lu1/g$d;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput v1, p0, Lu1/g$d;->c:F

    iput v1, p0, Lu1/g$d;->d:F

    iput v1, p0, Lu1/g$d;->e:F

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, p0, Lu1/g$d;->f:F

    iput v2, p0, Lu1/g$d;->g:F

    iput v1, p0, Lu1/g$d;->h:F

    iput v1, p0, Lu1/g$d;->i:F

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lu1/g$d;->j:Landroid/graphics/Matrix;

    iput-object v0, p0, Lu1/g$d;->m:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lu1/g$d;Lt/a;)V
    .locals 4

    .line 2
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu1/g$e;-><init>(Lu1/g$a;)V

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lu1/g$d;->a:Landroid/graphics/Matrix;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lu1/g$d;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput v1, p0, Lu1/g$d;->c:F

    iput v1, p0, Lu1/g$d;->d:F

    iput v1, p0, Lu1/g$d;->e:F

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, p0, Lu1/g$d;->f:F

    iput v2, p0, Lu1/g$d;->g:F

    iput v1, p0, Lu1/g$d;->h:F

    iput v1, p0, Lu1/g$d;->i:F

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lu1/g$d;->j:Landroid/graphics/Matrix;

    iput-object v0, p0, Lu1/g$d;->m:Ljava/lang/String;

    iget v0, p1, Lu1/g$d;->c:F

    iput v0, p0, Lu1/g$d;->c:F

    iget v0, p1, Lu1/g$d;->d:F

    iput v0, p0, Lu1/g$d;->d:F

    iget v0, p1, Lu1/g$d;->e:F

    iput v0, p0, Lu1/g$d;->e:F

    iget v0, p1, Lu1/g$d;->f:F

    iput v0, p0, Lu1/g$d;->f:F

    iget v0, p1, Lu1/g$d;->g:F

    iput v0, p0, Lu1/g$d;->g:F

    iget v0, p1, Lu1/g$d;->h:F

    iput v0, p0, Lu1/g$d;->h:F

    iget v0, p1, Lu1/g$d;->i:F

    iput v0, p0, Lu1/g$d;->i:F

    iget-object v0, p1, Lu1/g$d;->l:[I

    iput-object v0, p0, Lu1/g$d;->l:[I

    iget-object v0, p1, Lu1/g$d;->m:Ljava/lang/String;

    iput-object v0, p0, Lu1/g$d;->m:Ljava/lang/String;

    iget v2, p1, Lu1/g$d;->k:I

    iput v2, p0, Lu1/g$d;->k:I

    if-eqz v0, :cond_0

    invoke-virtual {p2, v0, p0}, Lt/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p1, Lu1/g$d;->j:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object p1, p1, Lu1/g$d;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lu1/g$d;

    if-eqz v2, :cond_1

    check-cast v1, Lu1/g$d;

    iget-object v2, p0, Lu1/g$d;->b:Ljava/util/ArrayList;

    new-instance v3, Lu1/g$d;

    invoke-direct {v3, v1, p2}, Lu1/g$d;-><init>(Lu1/g$d;Lt/a;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    instance-of v2, v1, Lu1/g$c;

    if-eqz v2, :cond_2

    new-instance v2, Lu1/g$c;

    check-cast v1, Lu1/g$c;

    invoke-direct {v2, v1}, Lu1/g$c;-><init>(Lu1/g$c;)V

    goto :goto_1

    :cond_2
    instance-of v2, v1, Lu1/g$b;

    if-eqz v2, :cond_4

    new-instance v2, Lu1/g$b;

    check-cast v1, Lu1/g$b;

    invoke-direct {v2, v1}, Lu1/g$b;-><init>(Lu1/g$b;)V

    :goto_1
    iget-object v1, p0, Lu1/g$d;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, Lu1/g$f;->b:Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-virtual {p2, v1, v2}, Lt/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown object in the tree!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lu1/g$d;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    iget-object v2, p0, Lu1/g$d;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lu1/g$e;

    .line 18
    .line 19
    invoke-virtual {v2}, Lu1/g$e;->a()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return v0
.end method

.method public b([I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lu1/g$d;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v0, v2, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lu1/g$d;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lu1/g$e;

    .line 18
    .line 19
    invoke-virtual {v2, p1}, Lu1/g$e;->b([I)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    or-int/2addr v1, v2

    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return v1
.end method

.method public c(Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 1

    .line 1
    sget-object v0, Lu1/a;->b:[I

    .line 2
    .line 3
    invoke-static {p1, p3, p2, v0}, Lz/k;->k(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1, p4}, Lu1/g$d;->e(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lu1/g$d;->j:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu1/g$d;->j:Landroid/graphics/Matrix;

    .line 7
    .line 8
    iget v1, p0, Lu1/g$d;->d:F

    .line 9
    .line 10
    neg-float v1, v1

    .line 11
    iget v2, p0, Lu1/g$d;->e:F

    .line 12
    .line 13
    neg-float v2, v2

    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lu1/g$d;->j:Landroid/graphics/Matrix;

    .line 18
    .line 19
    iget v1, p0, Lu1/g$d;->f:F

    .line 20
    .line 21
    iget v2, p0, Lu1/g$d;->g:F

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lu1/g$d;->j:Landroid/graphics/Matrix;

    .line 27
    .line 28
    iget v1, p0, Lu1/g$d;->c:F

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-virtual {v0, v1, v2, v2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lu1/g$d;->j:Landroid/graphics/Matrix;

    .line 35
    .line 36
    iget v1, p0, Lu1/g$d;->h:F

    .line 37
    .line 38
    iget v2, p0, Lu1/g$d;->d:F

    .line 39
    .line 40
    add-float/2addr v1, v2

    .line 41
    iget v2, p0, Lu1/g$d;->i:F

    .line 42
    .line 43
    iget v3, p0, Lu1/g$d;->e:F

    .line 44
    .line 45
    add-float/2addr v2, v3

    .line 46
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final e(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lu1/g$d;->l:[I

    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    iget v1, p0, Lu1/g$d;->c:F

    .line 6
    .line 7
    const-string v2, "rotation"

    .line 8
    .line 9
    invoke-static {p1, p2, v2, v0, v1}, Lz/k;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lu1/g$d;->c:F

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iget v1, p0, Lu1/g$d;->d:F

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, p0, Lu1/g$d;->d:F

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    iget v1, p0, Lu1/g$d;->e:F

    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, Lu1/g$d;->e:F

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    iget v1, p0, Lu1/g$d;->f:F

    .line 35
    .line 36
    const-string v2, "scaleX"

    .line 37
    .line 38
    invoke-static {p1, p2, v2, v0, v1}, Lz/k;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput v0, p0, Lu1/g$d;->f:F

    .line 43
    .line 44
    const/4 v0, 0x4

    .line 45
    iget v1, p0, Lu1/g$d;->g:F

    .line 46
    .line 47
    const-string v2, "scaleY"

    .line 48
    .line 49
    invoke-static {p1, p2, v2, v0, v1}, Lz/k;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iput v0, p0, Lu1/g$d;->g:F

    .line 54
    .line 55
    const/4 v0, 0x6

    .line 56
    iget v1, p0, Lu1/g$d;->h:F

    .line 57
    .line 58
    const-string v2, "translateX"

    .line 59
    .line 60
    invoke-static {p1, p2, v2, v0, v1}, Lz/k;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iput v0, p0, Lu1/g$d;->h:F

    .line 65
    .line 66
    const/4 v0, 0x7

    .line 67
    iget v1, p0, Lu1/g$d;->i:F

    .line 68
    .line 69
    const-string v2, "translateY"

    .line 70
    .line 71
    invoke-static {p1, p2, v2, v0, v1}, Lz/k;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    iput p2, p0, Lu1/g$d;->i:F

    .line 76
    .line 77
    const/4 p2, 0x0

    .line 78
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz p1, :cond_0

    .line 83
    .line 84
    iput-object p1, p0, Lu1/g$d;->m:Ljava/lang/String;

    .line 85
    .line 86
    :cond_0
    invoke-virtual {p0}, Lu1/g$d;->d()V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public getGroupName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/g$d;->m:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLocalMatrix()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/g$d;->j:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPivotX()F
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public getPivotY()F
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public getRotation()F
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public getScaleX()F
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public getScaleY()F
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->g:F

    .line 2
    .line 3
    return v0
.end method

.method public getTranslateX()F
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public getTranslateY()F
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->i:F

    .line 2
    .line 3
    return v0
.end method

.method public setPivotX(F)V
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->d:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lu1/g$d;->d:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lu1/g$d;->d()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setPivotY(F)V
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->e:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lu1/g$d;->e:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lu1/g$d;->d()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setRotation(F)V
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->c:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lu1/g$d;->c:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lu1/g$d;->d()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setScaleX(F)V
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->f:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lu1/g$d;->f:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lu1/g$d;->d()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setScaleY(F)V
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->g:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lu1/g$d;->g:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lu1/g$d;->d()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setTranslateX(F)V
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->h:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lu1/g$d;->h:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lu1/g$d;->d()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setTranslateY(F)V
    .locals 1

    .line 1
    iget v0, p0, Lu1/g$d;->i:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lu1/g$d;->i:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lu1/g$d;->d()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
