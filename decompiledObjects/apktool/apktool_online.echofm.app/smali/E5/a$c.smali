.class public final LE5/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:LE5/a$e;

.field public final synthetic b:LE5/a;


# direct methods
.method public constructor <init>(LE5/a;LE5/a$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE5/a$c;->b:LE5/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LE5/a$c;->a:LE5/a$e;

    return-void
.end method

.method public synthetic constructor <init>(LE5/a;LE5/a$e;LE5/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, LE5/a$c;-><init>(LE5/a;LE5/a$e;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, LE5/a$c;->a:LE5/a$e;

    .line 2
    .line 3
    iget-object v1, p0, LE5/a$c;->b:LE5/a;

    .line 4
    .line 5
    invoke-static {v1}, LE5/a;->a(LE5/a;)LE5/i;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1, p1}, LE5/i;->b(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v0, p1}, LE5/a$e;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception p1

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "BasicMessageChannel#"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, LE5/a$c;->b:LE5/a;

    .line 29
    .line 30
    invoke-static {v1}, LE5/a;->b(LE5/a;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "Failed to handle message reply"

    .line 42
    .line 43
    invoke-static {v0, v1, p1}, Lt5/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    return-void
.end method
