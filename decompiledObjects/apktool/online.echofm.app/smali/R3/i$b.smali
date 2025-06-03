.class public LR3/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls3/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR3/i;->d(LV3/f;LT3/c;LT3/f;LT3/h$a;)LT3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LT3/h;

.field public final synthetic b:LR3/i;


# direct methods
.method public constructor <init>(LR3/i;LT3/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR3/i$b;->b:LR3/i;

    .line 2
    .line 3
    iput-object p2, p0, LR3/i$b;->a:LT3/h;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .line 1
    const-string v0, "app_in_background"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, LR3/i$b;->a:LT3/h;

    .line 6
    .line 7
    invoke-interface {p1, v0}, LT3/h;->j(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, LR3/i$b;->a:LT3/h;

    .line 12
    .line 13
    invoke-interface {p1, v0}, LT3/h;->p(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
.end method
