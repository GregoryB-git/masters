.class public final Lj5/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:[I

.field public final c:[I

.field public final d:[I


# direct methods
.method public constructor <init>(I[I[I[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lj5/b$a;->a:I

    iput-object p2, p0, Lj5/b$a;->b:[I

    iput-object p3, p0, Lj5/b$a;->c:[I

    iput-object p4, p0, Lj5/b$a;->d:[I

    return-void
.end method
