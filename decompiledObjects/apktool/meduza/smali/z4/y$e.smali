.class public final Lz4/y$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:Lz4/j0;

.field public final b:[Z

.field public final c:[Z

.field public final d:[Z


# direct methods
.method public constructor <init>(Lz4/j0;[Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/y$e;->a:Lz4/j0;

    iput-object p2, p0, Lz4/y$e;->b:[Z

    iget p1, p1, Lz4/j0;->a:I

    new-array p2, p1, [Z

    iput-object p2, p0, Lz4/y$e;->c:[Z

    new-array p1, p1, [Z

    iput-object p1, p0, Lz4/y$e;->d:[Z

    return-void
.end method
