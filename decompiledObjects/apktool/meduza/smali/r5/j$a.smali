.class public final Lr5/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr5/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:[I

.field public final c:[Lz4/j0;

.field public final d:[I

.field public final e:[[[I

.field public final f:Lz4/j0;


# direct methods
.method public constructor <init>([I[Lz4/j0;[I[[[ILz4/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/j$a;->b:[I

    iput-object p2, p0, Lr5/j$a;->c:[Lz4/j0;

    iput-object p4, p0, Lr5/j$a;->e:[[[I

    iput-object p3, p0, Lr5/j$a;->d:[I

    iput-object p5, p0, Lr5/j$a;->f:Lz4/j0;

    array-length p1, p1

    iput p1, p0, Lr5/j$a;->a:I

    return-void
.end method
