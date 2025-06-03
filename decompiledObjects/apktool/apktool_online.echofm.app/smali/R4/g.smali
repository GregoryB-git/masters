.class public final synthetic LR4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/e;


# instance fields
.field public final synthetic a:LR4/h;


# direct methods
.method public synthetic constructor <init>(LR4/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR4/g;->a:LR4/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LR4/g;->a:LR4/h;

    .line 2
    .line 3
    check-cast p1, LR4/q;

    .line 4
    .line 5
    invoke-static {v0, p1}, LR4/h;->b(LR4/h;LR4/q;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
