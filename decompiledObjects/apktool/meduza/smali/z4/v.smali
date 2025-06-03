.class public final synthetic Lz4/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz4/w$a;

.field public final synthetic b:Lz4/w;

.field public final synthetic c:Lz4/n;

.field public final synthetic d:Lz4/q;

.field public final synthetic e:Ljava/io/IOException;

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(Lz4/w$a;Lz4/w;Lz4/n;Lz4/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/v;->a:Lz4/w$a;

    iput-object p2, p0, Lz4/v;->b:Lz4/w;

    iput-object p3, p0, Lz4/v;->c:Lz4/n;

    iput-object p4, p0, Lz4/v;->d:Lz4/q;

    iput-object p5, p0, Lz4/v;->e:Ljava/io/IOException;

    iput-boolean p6, p0, Lz4/v;->f:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lz4/v;->a:Lz4/w$a;

    iget-object v1, p0, Lz4/v;->b:Lz4/w;

    iget-object v4, p0, Lz4/v;->c:Lz4/n;

    iget-object v5, p0, Lz4/v;->d:Lz4/q;

    iget-object v6, p0, Lz4/v;->e:Ljava/io/IOException;

    iget-boolean v7, p0, Lz4/v;->f:Z

    iget v2, v0, Lz4/w$a;->a:I

    iget-object v3, v0, Lz4/w$a;->b:Lz4/t$b;

    invoke-interface/range {v1 .. v7}, Lz4/w;->f0(ILz4/t$b;Lz4/n;Lz4/q;Ljava/io/IOException;Z)V

    return-void
.end method
