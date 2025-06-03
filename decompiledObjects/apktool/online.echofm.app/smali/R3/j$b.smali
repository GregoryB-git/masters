.class public LR3/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR3/j;->G(LV3/k;LV3/k;LY3/d;LY3/d;LX3/g;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LY3/d;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:LV3/k;

.field public final synthetic d:Ld4/n;

.field public final synthetic e:LR3/j;


# direct methods
.method public constructor <init>(LR3/j;LY3/d;Ljava/util/List;LV3/k;Ld4/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR3/j$b;->e:LR3/j;

    .line 2
    .line 3
    iput-object p2, p0, LR3/j$b;->a:LY3/d;

    .line 4
    .line 5
    iput-object p3, p0, LR3/j$b;->b:Ljava/util/List;

    .line 6
    .line 7
    iput-object p4, p0, LR3/j$b;->c:LV3/k;

    .line 8
    .line 9
    iput-object p5, p0, LR3/j$b;->d:Ld4/n;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic a(LV3/k;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Void;

    .line 2
    .line 3
    check-cast p3, Ljava/lang/Void;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, LR3/j$b;->b(LV3/k;Ljava/lang/Void;Ljava/lang/Void;)Ljava/lang/Void;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public b(LV3/k;Ljava/lang/Void;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2

    .line 1
    iget-object p2, p0, LR3/j$b;->a:LY3/d;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, LY3/d;->s(LV3/k;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, LR3/j$b;->b:Ljava/util/List;

    .line 10
    .line 11
    new-instance p3, LY3/g;

    .line 12
    .line 13
    iget-object v0, p0, LR3/j$b;->c:LV3/k;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, LV3/k;->T(LV3/k;)LV3/k;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, LR3/j$b;->d:Ld4/n;

    .line 20
    .line 21
    invoke-interface {v1, p1}, Ld4/n;->A(LV3/k;)Ld4/n;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {p3, v0, p1}, LY3/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    const/4 p1, 0x0

    .line 32
    return-object p1
.end method
