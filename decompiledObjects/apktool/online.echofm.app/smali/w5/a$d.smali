.class public Lw5/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:Lw5/c;


# direct methods
.method public constructor <init>(Lw5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/a$d;->a:Lw5/c;

    return-void
.end method

.method public synthetic constructor <init>(Lw5/c;Lw5/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lw5/a$d;-><init>(Lw5/c;)V

    return-void
.end method


# virtual methods
.method public a(LE5/c$d;)LE5/c$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lw5/a$d;->a:Lw5/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw5/c;->a(LE5/c$d;)LE5/c$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public synthetic b()LE5/c$c;
    .locals 1

    .line 1
    invoke-static {p0}, LE5/b;->a(LE5/c;)LE5/c$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c(Ljava/lang/String;LE5/c$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw5/a$d;->a:Lw5/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lw5/c;->c(Ljava/lang/String;LE5/c$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw5/a$d;->a:Lw5/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, p2, v1}, Lw5/c;->f(Ljava/lang/String;Ljava/nio/ByteBuffer;LE5/c$b;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/nio/ByteBuffer;LE5/c$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw5/a$d;->a:Lw5/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lw5/c;->f(Ljava/lang/String;Ljava/nio/ByteBuffer;LE5/c$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h(Ljava/lang/String;LE5/c$a;LE5/c$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw5/a$d;->a:Lw5/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lw5/c;->h(Ljava/lang/String;LE5/c$a;LE5/c$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
