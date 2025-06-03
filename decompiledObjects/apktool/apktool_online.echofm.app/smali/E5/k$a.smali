.class public final LE5/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE5/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:LE5/k$c;

.field public final synthetic b:LE5/k;


# direct methods
.method public constructor <init>(LE5/k;LE5/k$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE5/k$a;->b:LE5/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LE5/k$a;->a:LE5/k$c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;LE5/c$b;)V
    .locals 4

    .line 1
    iget-object v0, p0, LE5/k$a;->b:LE5/k;

    .line 2
    .line 3
    invoke-static {v0}, LE5/k;->a(LE5/k;)LE5/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, LE5/l;->e(Ljava/nio/ByteBuffer;)LE5/j;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :try_start_0
    iget-object v0, p0, LE5/k$a;->a:LE5/k$c;

    .line 12
    .line 13
    new-instance v1, LE5/k$a$a;

    .line 14
    .line 15
    invoke-direct {v1, p0, p2}, LE5/k$a$a;-><init>(LE5/k$a;LE5/c$b;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p1, v1}, LE5/k$c;->onMethodCall(LE5/j;LE5/k$d;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p1

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v1, "MethodChannel#"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, LE5/k$a;->b:LE5/k;

    .line 34
    .line 35
    invoke-static {v1}, LE5/k;->b(LE5/k;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "Failed to handle method call"

    .line 47
    .line 48
    invoke-static {v0, v1, p1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, LE5/k$a;->b:LE5/k;

    .line 52
    .line 53
    invoke-static {v0}, LE5/k;->a(LE5/k;)LE5/l;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-static {p1}, Lt5/b;->d(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-string v3, "error"

    .line 67
    .line 68
    invoke-interface {v0, v3, v1, v2, p1}, LE5/l;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-interface {p2, p1}, LE5/c$b;->a(Ljava/nio/ByteBuffer;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    return-void
.end method
