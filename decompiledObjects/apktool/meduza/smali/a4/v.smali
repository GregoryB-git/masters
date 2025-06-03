.class public final La4/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La4/w;


# instance fields
.field public final a:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/v;->a:[B

    return-void
.end method


# virtual methods
.method public final a(La4/o$d;)[B
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final b(Ljava/util/UUID;La4/o$a;)[B
    .locals 0

    iget-object p1, p0, La4/v;->a:[B

    return-object p1
.end method
