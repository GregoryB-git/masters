.class public final Lp6/p0;
.super Lp6/w0;
.source "SourceFile"


# instance fields
.field public final s:Lg6/l;


# direct methods
.method public constructor <init>(Lg6/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp6/w0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp6/p0;->s:Lg6/l;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lp6/p0;->v(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LV5/t;->a:LV5/t;

    .line 7
    .line 8
    return-object p1
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp6/p0;->s:Lg6/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lg6/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
