.class public LA2/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA2/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:LA2/c;


# direct methods
.method public constructor <init>(LA2/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA2/c$d;->a:LA2/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Lx2/b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lx2/b;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LA2/c$d;->a:LA2/c;

    .line 8
    .line 9
    invoke-virtual {p1}, LA2/c;->C()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v1, v0}, LA2/c;->o(LA2/i;Ljava/util/Set;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, LA2/c$d;->a:LA2/c;

    .line 19
    .line 20
    invoke-static {v0}, LA2/c;->V(LA2/c;)LA2/c$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, LA2/c$d;->a:LA2/c;

    .line 27
    .line 28
    invoke-static {v0}, LA2/c;->V(LA2/c;)LA2/c$b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0, p1}, LA2/c$b;->o(Lx2/b;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method
