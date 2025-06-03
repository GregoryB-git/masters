.class public Lw5/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lw5/a;


# direct methods
.method public constructor <init>(Lw5/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw5/a$a;->a:Lw5/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;LE5/c$b;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lw5/a$a;->a:Lw5/a;

    .line 2
    .line 3
    sget-object v0, LE5/r;->b:LE5/r;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LE5/r;->c(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p2, p1}, Lw5/a;->e(Lw5/a;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lw5/a$a;->a:Lw5/a;

    .line 13
    .line 14
    invoke-static {p1}, Lw5/a;->g(Lw5/a;)Lw5/a$e;

    .line 15
    .line 16
    .line 17
    return-void
.end method
