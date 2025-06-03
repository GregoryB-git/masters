.class public final Lo0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final a:Lo0/h$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo0/h$a;

    invoke-direct {v0}, Lo0/h$a;-><init>()V

    sput-object v0, Lo0/h;->a:Lo0/h$a;

    return-void
.end method
