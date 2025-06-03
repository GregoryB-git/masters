.class public final LZ0/a$b;
.super LZ0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final b:Lg0/z;


# direct methods
.method public constructor <init>(ILg0/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LZ0/a;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LZ0/a$b;->b:Lg0/z;

    .line 5
    .line 6
    return-void
.end method
