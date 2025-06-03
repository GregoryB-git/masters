.class public final Lma/l1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/l1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lma/l1$a$a;

.field public static final b:Lma/l1$a$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lma/l1$a$a;

    invoke-direct {v0}, Lma/l1$a$a;-><init>()V

    sput-object v0, Lma/l1$a;->a:Lma/l1$a$a;

    new-instance v0, Lma/l1$a$b;

    invoke-direct {v0}, Lma/l1$a$b;-><init>()V

    sput-object v0, Lma/l1$a;->b:Lma/l1$a$b;

    return-void
.end method
