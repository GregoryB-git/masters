.class public final synthetic Lw5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lw5/c;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:I

.field public final synthetic r:Lw5/c$f;

.field public final synthetic s:Ljava/nio/ByteBuffer;

.field public final synthetic t:J


# direct methods
.method public synthetic constructor <init>(Lw5/c;Ljava/lang/String;ILw5/c$f;Ljava/nio/ByteBuffer;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw5/b;->o:Lw5/c;

    .line 5
    .line 6
    iput-object p2, p0, Lw5/b;->p:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lw5/b;->q:I

    .line 9
    .line 10
    iput-object p4, p0, Lw5/b;->r:Lw5/c$f;

    .line 11
    .line 12
    iput-object p5, p0, Lw5/b;->s:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    iput-wide p6, p0, Lw5/b;->t:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lw5/b;->o:Lw5/c;

    .line 2
    .line 3
    iget-object v1, p0, Lw5/b;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lw5/b;->q:I

    .line 6
    .line 7
    iget-object v3, p0, Lw5/b;->r:Lw5/c$f;

    .line 8
    .line 9
    iget-object v4, p0, Lw5/b;->s:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    iget-wide v5, p0, Lw5/b;->t:J

    .line 12
    .line 13
    invoke-static/range {v0 .. v6}, Lw5/c;->i(Lw5/c;Ljava/lang/String;ILw5/c$f;Ljava/nio/ByteBuffer;J)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
