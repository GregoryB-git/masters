.class public final synthetic Lw3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/l$a;


# instance fields
.field public final synthetic a:Lz4/q;


# direct methods
.method public synthetic constructor <init>(Lw3/b$a;Lz4/n;Lz4/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lw3/i;->a:Lz4/q;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw3/i;->a:Lz4/q;

    check-cast p1, Lw3/b;

    invoke-interface {p1, v0}, Lw3/b;->g0(Lz4/q;)V

    return-void
.end method
