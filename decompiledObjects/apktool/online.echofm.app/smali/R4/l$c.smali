.class public final LR4/l$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR4/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR4/l;-><init>(Ls3/e;Ls4/i;Lp6/F;Lp6/F;Lr4/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:LR4/l;


# direct methods
.method public constructor <init>(LR4/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/l$c;->a:LR4/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LR4/p;LX5/d;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LR4/l$c;->a:LR4/l;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, LR4/l;->c(LR4/l;LR4/p;LX5/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, LV5/t;->a:LV5/t;

    .line 15
    .line 16
    return-object p1
.end method
