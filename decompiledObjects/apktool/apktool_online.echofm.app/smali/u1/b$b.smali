.class public Lu1/b$b;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:Lu1/g;

.field public c:Landroid/animation/AnimatorSet;

.field public d:Ljava/util/ArrayList;

.field public e:Lt/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lu1/b$b;Landroid/graphics/drawable/Drawable$Callback;Landroid/content/res/Resources;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_3

    .line 5
    .line 6
    iget p1, p2, Lu1/b$b;->a:I

    .line 7
    .line 8
    iput p1, p0, Lu1/b$b;->a:I

    .line 9
    .line 10
    iget-object p1, p2, Lu1/b$b;->b:Lu1/g;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Lu1/g;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p4, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1, p4}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    check-cast p1, Lu1/g;

    .line 26
    .line 27
    iput-object p1, p0, Lu1/b$b;->b:Lu1/g;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object p1, p0, Lu1/b$b;->b:Lu1/g;

    .line 36
    .line 37
    invoke-virtual {p1}, Lu1/g;->mutate()Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lu1/g;

    .line 42
    .line 43
    iput-object p1, p0, Lu1/b$b;->b:Lu1/g;

    .line 44
    .line 45
    invoke-virtual {p1, p3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lu1/b$b;->b:Lu1/g;

    .line 49
    .line 50
    iget-object p3, p2, Lu1/b$b;->b:Lu1/g;

    .line 51
    .line 52
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    invoke-virtual {p1, p3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lu1/b$b;->b:Lu1/g;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lu1/g;->h(Z)V

    .line 62
    .line 63
    .line 64
    :cond_1
    iget-object p1, p2, Lu1/b$b;->d:Ljava/util/ArrayList;

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    new-instance p3, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    iput-object p3, p0, Lu1/b$b;->d:Ljava/util/ArrayList;

    .line 78
    .line 79
    new-instance p3, Lt/a;

    .line 80
    .line 81
    invoke-direct {p3, p1}, Lt/a;-><init>(I)V

    .line 82
    .line 83
    .line 84
    iput-object p3, p0, Lu1/b$b;->e:Lt/a;

    .line 85
    .line 86
    :goto_2
    if-ge v0, p1, :cond_2

    .line 87
    .line 88
    iget-object p3, p2, Lu1/b$b;->d:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    check-cast p3, Landroid/animation/Animator;

    .line 95
    .line 96
    invoke-virtual {p3}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    iget-object v1, p2, Lu1/b$b;->e:Lt/a;

    .line 101
    .line 102
    invoke-virtual {v1, p3}, Lt/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    check-cast p3, Ljava/lang/String;

    .line 107
    .line 108
    iget-object v1, p0, Lu1/b$b;->b:Lu1/g;

    .line 109
    .line 110
    invoke-virtual {v1, p3}, Lu1/g;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {p4, v1}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, Lu1/b$b;->d:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, Lu1/b$b;->e:Lt/a;

    .line 123
    .line 124
    invoke-virtual {v1, p4, p3}, Lt/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    add-int/lit8 v0, v0, 0x1

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_2
    invoke-virtual {p0}, Lu1/b$b;->a()V

    .line 131
    .line 132
    .line 133
    :cond_3
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu1/b$b;->c:Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lu1/b$b;->c:Landroid/animation/AnimatorSet;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lu1/b$b;->c:Landroid/animation/AnimatorSet;

    .line 13
    .line 14
    iget-object v1, p0, Lu1/b$b;->d:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public getChangingConfigurations()I
    .locals 1

    .line 1
    iget v0, p0, Lu1/b$b;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No constant state support for SDK < 24."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No constant state support for SDK < 24."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
