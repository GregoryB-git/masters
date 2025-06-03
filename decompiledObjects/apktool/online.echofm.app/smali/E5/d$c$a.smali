.class public final LE5/d$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE5/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic b:LE5/d$c;


# direct methods
.method public constructor <init>(LE5/d$c;)V
    .locals 1

    .line 1
    iput-object p1, p0, LE5/d$c$a;->b:LE5/d$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, LE5/d$c$a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public synthetic constructor <init>(LE5/d$c;LE5/d$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LE5/d$c$a;-><init>(LE5/d$c;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, LE5/d$c$a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LE5/d$c$a;->b:LE5/d$c;

    .line 10
    .line 11
    invoke-static {v0}, LE5/d$c;->b(LE5/d$c;)Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eq v0, p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, LE5/d$c$a;->b:LE5/d$c;

    .line 23
    .line 24
    iget-object v0, v0, LE5/d$c;->c:LE5/d;

    .line 25
    .line 26
    invoke-static {v0}, LE5/d;->c(LE5/d;)LE5/c;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, LE5/d$c$a;->b:LE5/d$c;

    .line 31
    .line 32
    iget-object v1, v1, LE5/d$c;->c:LE5/d;

    .line 33
    .line 34
    invoke-static {v1}, LE5/d;->b(LE5/d;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, LE5/d$c$a;->b:LE5/d$c;

    .line 39
    .line 40
    iget-object v2, v2, LE5/d$c;->c:LE5/d;

    .line 41
    .line 42
    invoke-static {v2}, LE5/d;->a(LE5/d;)LE5/l;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v2, p1}, LE5/l;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {v0, v1, p1}, LE5/c;->d(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, LE5/d$c$a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LE5/d$c$a;->b:LE5/d$c;

    .line 10
    .line 11
    invoke-static {v0}, LE5/d$c;->b(LE5/d$c;)Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eq v0, p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, LE5/d$c$a;->b:LE5/d$c;

    .line 23
    .line 24
    iget-object v0, v0, LE5/d$c;->c:LE5/d;

    .line 25
    .line 26
    invoke-static {v0}, LE5/d;->c(LE5/d;)LE5/c;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, LE5/d$c$a;->b:LE5/d$c;

    .line 31
    .line 32
    iget-object v1, v1, LE5/d$c;->c:LE5/d;

    .line 33
    .line 34
    invoke-static {v1}, LE5/d;->b(LE5/d;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, LE5/d$c$a;->b:LE5/d$c;

    .line 39
    .line 40
    iget-object v2, v2, LE5/d$c;->c:LE5/d;

    .line 41
    .line 42
    invoke-static {v2}, LE5/d;->a(LE5/d;)LE5/l;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v2, p1, p2, p3}, LE5/l;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {v0, v1, p1}, LE5/c;->d(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_0
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, LE5/d$c$a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LE5/d$c$a;->b:LE5/d$c;

    .line 11
    .line 12
    invoke-static {v0}, LE5/d$c;->b(LE5/d$c;)Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eq v0, p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, LE5/d$c$a;->b:LE5/d$c;

    .line 24
    .line 25
    iget-object v0, v0, LE5/d$c;->c:LE5/d;

    .line 26
    .line 27
    invoke-static {v0}, LE5/d;->c(LE5/d;)LE5/c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, LE5/d$c$a;->b:LE5/d$c;

    .line 32
    .line 33
    iget-object v1, v1, LE5/d$c;->c:LE5/d;

    .line 34
    .line 35
    invoke-static {v1}, LE5/d;->b(LE5/d;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-interface {v0, v1, v2}, LE5/c;->d(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    return-void
.end method
