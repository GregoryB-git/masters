.class public final Le1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le1/a;
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

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Le1/a$a;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Le1/a$a;->b:[I

    .line 7
    .line 8
    iput-object p3, p0, Le1/a$a;->c:[I

    .line 9
    .line 10
    iput-object p4, p0, Le1/a$a;->d:[I

    .line 11
    .line 12
    return-void
.end method
