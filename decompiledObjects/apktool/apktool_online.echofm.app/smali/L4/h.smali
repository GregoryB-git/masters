.class public final synthetic LL4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LL4/k;

.field public final synthetic p:LN4/h;

.field public final synthetic q:LN4/d;


# direct methods
.method public synthetic constructor <init>(LL4/k;LN4/h;LN4/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL4/h;->o:LL4/k;

    .line 5
    .line 6
    iput-object p2, p0, LL4/h;->p:LN4/h;

    .line 7
    .line 8
    iput-object p3, p0, LL4/h;->q:LN4/d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LL4/h;->o:LL4/k;

    .line 2
    .line 3
    iget-object v1, p0, LL4/h;->p:LN4/h;

    .line 4
    .line 5
    iget-object v2, p0, LL4/h;->q:LN4/d;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LL4/k;->e(LL4/k;LN4/h;LN4/d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
